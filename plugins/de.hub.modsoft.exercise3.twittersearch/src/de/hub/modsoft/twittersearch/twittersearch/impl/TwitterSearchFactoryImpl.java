/**
 */
package de.hub.modsoft.twittersearch.twittersearch.impl;

import de.hub.modsoft.twittersearch.twittersearch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterSearchFactoryImpl extends EFactoryImpl implements TwitterSearchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TwitterSearchFactory init() {
		try {
			TwitterSearchFactory theTwitterSearchFactory = (TwitterSearchFactory)EPackage.Registry.INSTANCE.getEFactory(TwitterSearchPackage.eNS_URI);
			if (theTwitterSearchFactory != null) {
				return theTwitterSearchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TwitterSearchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterSearchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TwitterSearchPackage.EXAMPLE_CLASS: return createExampleClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleClass createExampleClass() {
		ExampleClassImpl exampleClass = new ExampleClassImpl();
		return exampleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterSearchPackage getTwitterSearchPackage() {
		return (TwitterSearchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TwitterSearchPackage getPackage() {
		return TwitterSearchPackage.eINSTANCE;
	}

} //TwitterSearchFactoryImpl
