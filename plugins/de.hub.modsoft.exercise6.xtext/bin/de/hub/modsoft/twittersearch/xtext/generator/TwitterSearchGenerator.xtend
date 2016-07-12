package de.hub.modsoft.twittersearch.xtext.generator

import de.hub.modsoft.twittersearch.model.BooleanCondition
import de.hub.modsoft.twittersearch.model.IntCondition
import de.hub.modsoft.twittersearch.model.IntOperators
import de.hub.modsoft.twittersearch.model.Keywords
import de.hub.modsoft.twittersearch.model.Location
import de.hub.modsoft.twittersearch.model.Model
import de.hub.modsoft.twittersearch.model.Search
import de.hub.modsoft.twittersearch.model.Time
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage
import de.hub.modsoft.twittersearch.xtext.TwitterSearchParser
import java.io.File
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import org.apache.commons.io.FileUtils
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TwitterSearchGenerator implements IGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val model = input.contents.get(0) as Model
		fsa.generateFile('de/hub/modsoft/twittersearch/RunSearchMain.java', doGenerate(model))		
	}
	
	def doGenerate(Model model) '''
		package de.hub.modsoft.twittersearch;
		
		import org.json.JSONArray;
		import org.json.JSONObject;
		
		import com.mashape.unirest.http.HttpResponse;
		import com.mashape.unirest.http.JsonNode;
		import com.mashape.unirest.http.Unirest;
		import com.mashape.unirest.request.GetRequest;
		
		public class RunSearchMain {
			
			public static void main(String[] args) throws Exception {
				«FOR search: model.searches»
					{						
						«doGenerateRunSearch(search)»
					}
				«ENDFOR»
			}
		}
	'''
	
	dispatch def parameter(Keywords option) {
		return "q" -> option.keywords.map[substring(1,it.length-1)].join(" ")
	}
	
	dispatch def parameter(Location option) {
		val format = new DecimalFormat("#.000000")
		return "geocode" -> '''«format.format(option.lon)»,«format.format(option.lat)»,«option.radius as int»«option.radiusUnit»'''
	}
	
	dispatch def parameter(Time option) {
		return "before" -> '''«new SimpleDateFormat("YYYY-MM-DD").format(option.before)»'''
	}
	
	def uri(Search search) {
		return switch (search.searchType.name) {
			case "Tweet": "search/tweets"
			case "User": "users/search"
			default: throw new RuntimeException("impossible")
		}
	}
	
	dispatch def condition(BooleanCondition condition) {
		val entity = condition.fieldDeclaration.name.substring(3).toLowerCase	+ "s"
		return '''result.getJSONObject("entities").getJSONArray("«entity»").length() > 0'''
	}
	
	def intOperator(IntOperators op) {
		switch (op) {
			case EQ: "=="
			case GEQ: ">="
			case LEQ: "<="
			case GT: ">"
			case LT: "<"
		}
	}

	dispatch def condition(IntCondition condition) {
		return '''result.getInt("«condition.fieldDeclaration.name»") «condition.operator.intOperator» «condition.operand»'''
	}
	
	def doGenerateRunSearch(Search search) '''
		GetRequest request = Unirest.get("http://jupiter.informatik.hu-berlin.de:8080/1.1/«search.uri».json");
		request.queryString("count", "100");
		«FOR option:search.options.map[parameter]»
			request.queryString("«option.key»", "«option.value»");
		«ENDFOR»
		System.out.println(request.getUrl());
		
		HttpResponse<JsonNode> response = request.asJson();
		if (response.getStatus() != 200) {
			System.out.println("Something went wrong.");
		}
		
		«IF search.searchType.name == "User"»
			JSONArray results = response.getBody().getArray();
		«ELSE»
			JSONArray results = response.getBody().getObject().getJSONArray("statuses");
		«ENDIF»
		
		int count = 0;
		for (int i = 0; i < results.length(); i++) {
			JSONObject result = results.getJSONObject(i);
			boolean fulfilsConditions = true;
			«FOR condition:search.conditions»
				fulfilsConditions &= «condition(condition)»;
			«ENDFOR»
			if (fulfilsConditions) {
				«IF search.searchType.name == "User"»
					System.out.print(result.getString("name") + ": ");
					System.out.println("\"" + result.getString("screen_name") + "\"");
				«ELSE»
					System.out.print(result.getJSONObject("user").getString("name") + ": ");
					System.out.println("\"" + result.getString("text") + "\"");				
				«ENDIF»
				if (count++ >= 3) break;				
			}
		}
	'''	

	static def void main(String[] args) {
		EPackage.Registry.INSTANCE.put(TwitterSearchPackage.eINSTANCE.nsURI, TwitterSearchPackage.eINSTANCE)
		val parser = new TwitterSearchParser
		val model = parser.parser('''
			twitter {
				primitive Integer
				primitive Boolean

				object Tweet {
					field retweet_count : Integer
					field hasImage : Boolean
					field hasURL : Boolean
				}

				object User {
					field favourites_count : Integer
					field followers_count : Integer
					field friends_count : Integer
				}
			}
			
			searches {
				search for Tweet with "VW" where retweet_count > 5 & hasURL
				search for Tweet with "quake" in geo(37.781157,-122.398720,100mi) where hasImage
				search for User with "Donald" before 11.07.2016 where followers_count > 10
			}
		''') as Model
		
		val generator = new TwitterSearchGenerator
		val code = generator.doGenerate(model)
		FileUtils.write(new File("src-gen/de/hub/modsoft/twittersearch/RunSearchMain.java"), code)
	}
}
