/*
 * generated by Xtext
 */
package de.hub.modsoft.twittersearch.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.hub.modsoft.twittersearch.model.Model;
import de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration;
import de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration;
import de.hub.modsoft.twittersearch.model.TwitterPrimitiveTypeDeclaration;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;
import de.hub.modsoft.twittersearch.xtext.services.TwitterSearchGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractTwitterSearchSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TwitterSearchGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TwitterSearchPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TwitterSearchPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION:
				sequence_FieldDclr(context, (TwitterFieldDeclaration) semanticObject); 
				return; 
			case TwitterSearchPackage.TWITTER_OBJECT_TYPE_DECLARATION:
				sequence_TwitterObjectType(context, (TwitterObjectTypeDeclaration) semanticObject); 
				return; 
			case TwitterSearchPackage.TWITTER_PRIMITIVE_TYPE_DECLARATION:
				sequence_TwitterPrimitiveType(context, (TwitterPrimitiveTypeDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID type=[TwitterTypeDeclaration|ID])
	 */
	protected void sequence_FieldDclr(EObject context, TwitterFieldDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (twitterTypes+=TwitterType* searches+=Search*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=FieldDclr*)
	 */
	protected void sequence_TwitterObjectType(EObject context, TwitterObjectTypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TwitterPrimitiveType(EObject context, TwitterPrimitiveTypeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TwitterSearchPackage.Literals.TWITTER_TYPE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TwitterSearchPackage.Literals.TWITTER_TYPE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTwitterPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
