package de.hub.modsoft.twittersearch.codegen

import de.hub.modsoft.twittersearch.model.Search
import de.hub.modsoft.twittersearch.model.Twitter
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage
import java.io.File
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
	def doGenerateRunSearch(Search search) '''
		// TODO
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