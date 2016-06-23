package de.hub.modsoft.twittersearch.codegen

import de.hub.modsoft.twittersearch.model.BooleanCondition
import de.hub.modsoft.twittersearch.model.IntCondition
import de.hub.modsoft.twittersearch.model.IntOperators
import de.hub.modsoft.twittersearch.model.Keywords
import de.hub.modsoft.twittersearch.model.Location
import de.hub.modsoft.twittersearch.model.Search
import de.hub.modsoft.twittersearch.model.Time
import de.hub.modsoft.twittersearch.model.Twitter
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage
import java.io.File
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import org.apache.commons.io.FileUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class CodeGenerator implements IGenerator {
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val model = input.contents.get(0) as Twitter
		fsa.generateFile('de/hub/modsoft/twittersearch/RunSearchMain.java', doGenerate(model))		
	}
	def doGenerate(Twitter model) '''
		package de.hub.modsoft.twittersearch;
		
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
		return switch (search.searchFor.name) {
			case "tweet": "search/tweets"
			case "user": "tweets/users"
			default: throw new RuntimeException("impossible")
		}
	}
	
	def jsonKey(Search search) {
		return switch (search.searchFor.name) {
			case "tweet": "statuses"
			case "user": "users"
			default: throw new RuntimeException("impossible")
		}
	}
	
	dispatch def condition(BooleanCondition condition) {
		val entity = condition.field.fieldDeclaration.name.substring(3).toLowerCase	+ "s"
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
		return '''result.getInt("«condition.field.fieldDeclaration.name»") «condition.operator.intOperator» «condition.operand»'''
	}
	
	def doGenerateRunSearch(Search search) '''
		GetRequest request = Unirest.get("http://localhost:8080/1.1/«search.uri».json");
		request.queryString("count", "100");
		«FOR option:search.options.map[parameter]»
			request.queryString("«option.key»", "«option.value»");
		«ENDFOR»
		println(request.getUrl());
		
		HttpResponse<JsonNode> response = request.asJson();
		if (response.getStatus() != 200) {
			println("Something went wrong.");
		}
		
		JSONArray results = response.getBody().getObject().getJSONArray("«search.jsonKey»");
		int count = 0;
		for (int i = 0; i < results.length(); i++) {
			JSONObject result = results.getJSONObject(i);
			boolean fulfilsConditions = true;
			«FOR condition:search.conditions»
				fulfilsConditions &= «condition(condition)»;
			«ENDFOR»
			if (fulfilsConditions) {
				System.out.print(result.getJSONObject("user").getString("name") + ": ");
				System.out.println("\"" + result.getString("text") + "\"");
				if (count++ >= 3) break;
			}
		}
	'''	

	static def void main(String[] args) {
		EPackage.Registry.INSTANCE.put(TwitterSearchPackage.eINSTANCE.nsURI, TwitterSearchPackage.eINSTANCE)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
		val rs = new ResourceSetImpl
		val resource = rs.getResource(URI.createURI("model/Examples.xmi"), true)
		val generator = new CodeGenerator
		val code = generator.doGenerate(resource.contents.get(0) as Twitter)
		FileUtils.write(new File("src-gen/de/hub/modsoft/twittersearch/RunSearchMain.java"), code)
	}
}