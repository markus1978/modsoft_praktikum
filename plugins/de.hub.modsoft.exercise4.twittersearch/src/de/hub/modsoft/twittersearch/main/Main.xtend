package de.hub.modsoft.twittersearch.main

import de.hub.modsoft.twittersearch.BooleanBinaryOp
import de.hub.modsoft.twittersearch.BooleanExpression
import de.hub.modsoft.twittersearch.Condition
import de.hub.modsoft.twittersearch.Dot
import de.hub.modsoft.twittersearch.FieldExpression
import de.hub.modsoft.twittersearch.FieldReference
import de.hub.modsoft.twittersearch.Model
import de.hub.modsoft.twittersearch.Not
import de.hub.modsoft.twittersearch.TwitterFieldDeclaration
import de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration
import de.hub.modsoft.twittersearch.TwitterSearchPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension de.hub.modsoft.twittersearch.main.IterableExtensions.*

class Main {
	
	/**
	 * @returns the field declaration that is represented by the given field expression.
	 */
	public static def TwitterFieldDeclaration fieldDeclaration(FieldExpression fieldExpr) {
		if (fieldExpr instanceof FieldReference) {
			return null //TODO
		} else if (fieldExpr instanceof Dot) {
			return null //TODO
		}
	}

	/**
	 * @returns true, iff all fields in the given field expression exist within the context of the given object type.
	 */
	public static def boolean fieldExists(FieldExpression fieldExpr, TwitterObjectTypeDeclaration objectType) {
		if (fieldExpr instanceof Dot) {
			// the left hand side's type must be an object type and
			// the field on the right hand side must be part of the left hand side's type and 
			// the left hand side field must by part of the given object type
			false // TODO
		} else if (fieldExpr instanceof FieldReference) {
			// the referenced field must be part of the given object type
			false // TODO
		} else {
			false
		}
	}
	
	/** 
	 * @returns true, iff the conditions type matches the type of the contained field expression and 
	 * all fields within the contained field expression exist in the context of the given search type.
	 */	
	public static def boolean checkType(Condition condition, TwitterObjectTypeDeclaration searchType) {		
		false // TODO
	}
	
	/**
	 * @return true, iff all contained conditions have correct type information within the context of
	 * the given search type.
	 */
	public static def boolean checkTypes(BooleanExpression expr, TwitterObjectTypeDeclaration searchType) {
		switch (expr) {
			Not: false // TODO
			BooleanBinaryOp: false // TODO
			Condition: expr.checkType(searchType)
			default: false 
		}		
	}

	public static def void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)		
		EPackage.Registry.INSTANCE.put(TwitterSearchPackage.eINSTANCE.nsURI, TwitterSearchPackage.eINSTANCE)
		
		val rs = new ResourceSetImpl
		val resource = rs.getResource(URI.createFileURI("model/Example.xmi"), true)
		val model = resource.contents.get(0) as Model
		
		println("Questions")		
		println("Do all searches search for tweets?")
		println("TODO")
		
		println("Does at least one search search for users?")
		println("TODO")
		
		println("How many different EClasses do all used search types instantiate?")
		println("TODO")
		
		println("Is there a search for each object type?")
		println("TODO")
		
		println('''
			How many conditions does the whole model contain. 
			Hints: You can use eAllContents() on all EObjects to get there whole contents as an iterator over EObjects!
			You can use toIterable to turn an iterator into an iterable.
			All collection functions (collect, select, etc.) only work on iterables.
		''')		
		println("TODO")
		
		println("Type checking:")
		model.searches.forEach[
			println(condition.checkTypes(searchType));
		]
	}	
}