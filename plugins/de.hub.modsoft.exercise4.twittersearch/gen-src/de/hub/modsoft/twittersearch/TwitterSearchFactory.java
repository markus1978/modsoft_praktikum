/**
 */
package de.hub.modsoft.twittersearch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage
 * @generated
 */
public interface TwitterSearchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterSearchFactory eINSTANCE = de.hub.modsoft.twittersearch.impl.TwitterSearchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search</em>'.
	 * @generated
	 */
	Search createSearch();

	/**
	 * Returns a new object of class '<em>Boolean Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Condition</em>'.
	 * @generated
	 */
	BooleanCondition createBooleanCondition();

	/**
	 * Returns a new object of class '<em>Int Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Condition</em>'.
	 * @generated
	 */
	IntCondition createIntCondition();

	/**
	 * Returns a new object of class '<em>Keywords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keywords</em>'.
	 * @generated
	 */
	Keywords createKeywords();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Twitter Object Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter Object Type Declaration</em>'.
	 * @generated
	 */
	TwitterObjectTypeDeclaration createTwitterObjectTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Twitter Field Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter Field Declaration</em>'.
	 * @generated
	 */
	TwitterFieldDeclaration createTwitterFieldDeclaration();

	/**
	 * Returns a new object of class '<em>Twitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter</em>'.
	 * @generated
	 */
	Twitter createTwitter();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Dot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot</em>'.
	 * @generated
	 */
	Dot createDot();

	/**
	 * Returns a new object of class '<em>Field Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Reference</em>'.
	 * @generated
	 */
	FieldReference createFieldReference();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TwitterSearchPackage getTwitterSearchPackage();

} //TwitterSearchFactory
