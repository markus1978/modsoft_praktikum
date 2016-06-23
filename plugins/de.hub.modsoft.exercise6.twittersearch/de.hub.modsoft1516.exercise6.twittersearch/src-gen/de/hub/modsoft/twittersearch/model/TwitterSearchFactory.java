/**
 */
package de.hub.modsoft.twittersearch.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage
 * @generated
 */
public interface TwitterSearchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterSearchFactory eINSTANCE = de.hub.modsoft.twittersearch.model.impl.TwitterSearchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search</em>'.
	 * @generated
	 */
	Search createSearch();

	/**
	 * Returns a new object of class '<em>Field Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Expr</em>'.
	 * @generated
	 */
	FieldExpr createFieldExpr();

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
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Twitter Field Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter Field Declaration</em>'.
	 * @generated
	 */
	TwitterFieldDeclaration createTwitterFieldDeclaration();

	/**
	 * Returns a new object of class '<em>Twitter Object Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter Object Type Declaration</em>'.
	 * @generated
	 */
	TwitterObjectTypeDeclaration createTwitterObjectTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Twitter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter Type</em>'.
	 * @generated
	 */
	TwitterType createTwitterType();

	/**
	 * Returns a new object of class '<em>Twitter Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter Primitive Type</em>'.
	 * @generated
	 */
	TwitterPrimitiveType createTwitterPrimitiveType();

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
