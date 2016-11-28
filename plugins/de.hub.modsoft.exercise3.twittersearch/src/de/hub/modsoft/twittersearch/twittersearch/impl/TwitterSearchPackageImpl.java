/**
 */
package de.hub.modsoft.twittersearch.twittersearch.impl;

import de.hub.modsoft.twittersearch.twittersearch.ExampleClass;
import de.hub.modsoft.twittersearch.twittersearch.TwitterSearchFactory;
import de.hub.modsoft.twittersearch.twittersearch.TwitterSearchPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterSearchPackageImpl extends EPackageImpl implements TwitterSearchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleClassEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hub.modsoft.twittersearch.twittersearch.TwitterSearchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TwitterSearchPackageImpl() {
		super(eNS_URI, TwitterSearchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TwitterSearchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TwitterSearchPackage init() {
		if (isInited) return (TwitterSearchPackage)EPackage.Registry.INSTANCE.getEPackage(TwitterSearchPackage.eNS_URI);

		// Obtain or create and register package
		TwitterSearchPackageImpl theTwitterSearchPackage = (TwitterSearchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TwitterSearchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TwitterSearchPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTwitterSearchPackage.createPackageContents();

		// Initialize created meta-data
		theTwitterSearchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTwitterSearchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TwitterSearchPackage.eNS_URI, theTwitterSearchPackage);
		return theTwitterSearchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleClass() {
		return exampleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterSearchFactory getTwitterSearchFactory() {
		return (TwitterSearchFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		exampleClassEClass = createEClass(EXAMPLE_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(exampleClassEClass, ExampleClass.class, "ExampleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TwitterSearchPackageImpl
