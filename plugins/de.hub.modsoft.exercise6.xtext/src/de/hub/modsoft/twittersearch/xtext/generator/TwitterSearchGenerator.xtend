package de.hub.modsoft.twittersearch.xtext.generator

import de.hub.modsoft.twittersearch.model.Model
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage
import de.hub.modsoft.twittersearch.xtext.TwitterSearchParser
import java.io.File
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
				// TODO
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
