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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TwitterSearchPackage getTwitterSearchPackage();

} //TwitterSearchFactory
