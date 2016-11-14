/**
 */
package de.hub.modsoft.twittersearch.twittersearch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.modsoft.twittersearch.twittersearch.TwitterSearchPackage
 * @generated
 */
public interface TwitterSearchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterSearchFactory eINSTANCE = de.hub.modsoft.twittersearch.twittersearch.impl.TwitterSearchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Example Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example Class</em>'.
	 * @generated
	 */
	ExampleClass createExampleClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TwitterSearchPackage getTwitterSearchPackage();

} //TwitterSearchFactory
