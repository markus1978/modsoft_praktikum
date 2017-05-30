/**
 */
package de.hub.modsoft.twittersearch.impl;

import de.hub.modsoft.twittersearch.BooleanCondition;
import de.hub.modsoft.twittersearch.Condition;
import de.hub.modsoft.twittersearch.DistanceUnit;
import de.hub.modsoft.twittersearch.Fields;
import de.hub.modsoft.twittersearch.IntCondition;
import de.hub.modsoft.twittersearch.IntOperators;
import de.hub.modsoft.twittersearch.Keywords;
import de.hub.modsoft.twittersearch.Location;
import de.hub.modsoft.twittersearch.Search;
import de.hub.modsoft.twittersearch.SearchOption;
import de.hub.modsoft.twittersearch.TwitterObjectType;
import de.hub.modsoft.twittersearch.TwitterSearchFactory;
import de.hub.modsoft.twittersearch.TwitterSearchPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass searchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum twitterObjectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fieldsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum distanceUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intOperatorsEEnum = null;

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
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#eNS_URI
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
	public EClass getSearch() {
		return searchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearch_Type() {
		return (EAttribute)searchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearch_Conditions() {
		return (EReference)searchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearch_Options() {
		return (EReference)searchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Field() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanCondition() {
		return booleanConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntCondition() {
		return intConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntCondition_Operand() {
		return (EAttribute)intConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntCondition_Operator() {
		return (EAttribute)intConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchOption() {
		return searchOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeywords() {
		return keywordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywords_Keywords() {
		return (EAttribute)keywordsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Lon() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Lat() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Radius() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_RadiusUnit() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTwitterObjectType() {
		return twitterObjectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFields() {
		return fieldsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDistanceUnit() {
		return distanceUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntOperators() {
		return intOperatorsEEnum;
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
		searchEClass = createEClass(SEARCH);
		createEAttribute(searchEClass, SEARCH__TYPE);
		createEReference(searchEClass, SEARCH__CONDITIONS);
		createEReference(searchEClass, SEARCH__OPTIONS);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__FIELD);

		booleanConditionEClass = createEClass(BOOLEAN_CONDITION);

		intConditionEClass = createEClass(INT_CONDITION);
		createEAttribute(intConditionEClass, INT_CONDITION__OPERAND);
		createEAttribute(intConditionEClass, INT_CONDITION__OPERATOR);

		searchOptionEClass = createEClass(SEARCH_OPTION);

		keywordsEClass = createEClass(KEYWORDS);
		createEAttribute(keywordsEClass, KEYWORDS__KEYWORDS);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LON);
		createEAttribute(locationEClass, LOCATION__LAT);
		createEAttribute(locationEClass, LOCATION__RADIUS);
		createEAttribute(locationEClass, LOCATION__RADIUS_UNIT);

		// Create enums
		twitterObjectTypeEEnum = createEEnum(TWITTER_OBJECT_TYPE);
		fieldsEEnum = createEEnum(FIELDS);
		distanceUnitEEnum = createEEnum(DISTANCE_UNIT);
		intOperatorsEEnum = createEEnum(INT_OPERATORS);
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
		booleanConditionEClass.getESuperTypes().add(this.getCondition());
		intConditionEClass.getESuperTypes().add(this.getCondition());
		keywordsEClass.getESuperTypes().add(this.getSearchOption());
		locationEClass.getESuperTypes().add(this.getSearchOption());

		// Initialize classes, features, and operations; add parameters
		initEClass(searchEClass, Search.class, "Search", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearch_Type(), this.getTwitterObjectType(), "type", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearch_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearch_Options(), this.getSearchOption(), null, "options", null, 0, -1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Field(), this.getFields(), "field", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanConditionEClass, BooleanCondition.class, "BooleanCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intConditionEClass, IntCondition.class, "IntCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntCondition_Operand(), ecorePackage.getEInt(), "operand", null, 0, 1, IntCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntCondition_Operator(), this.getIntOperators(), "operator", null, 0, 1, IntCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchOptionEClass, SearchOption.class, "SearchOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keywordsEClass, Keywords.class, "Keywords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeywords_Keywords(), ecorePackage.getEString(), "keywords", null, 0, -1, Keywords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Lon(), ecorePackage.getEDouble(), "lon", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Lat(), ecorePackage.getEDouble(), "lat", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Radius(), ecorePackage.getEDouble(), "radius", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_RadiusUnit(), this.getDistanceUnit(), "radiusUnit", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(twitterObjectTypeEEnum, TwitterObjectType.class, "TwitterObjectType");
		addEEnumLiteral(twitterObjectTypeEEnum, TwitterObjectType.TWEET);
		addEEnumLiteral(twitterObjectTypeEEnum, TwitterObjectType.USER);

		initEEnum(fieldsEEnum, Fields.class, "Fields");
		addEEnumLiteral(fieldsEEnum, Fields.FAVORITS);
		addEEnumLiteral(fieldsEEnum, Fields.RETWEETS);
		addEEnumLiteral(fieldsEEnum, Fields.MENTIONS);
		addEEnumLiteral(fieldsEEnum, Fields.HAS_URL);
		addEEnumLiteral(fieldsEEnum, Fields.HAS_IMAGE);
		addEEnumLiteral(fieldsEEnum, Fields.TWEETS);
		addEEnumLiteral(fieldsEEnum, Fields.FOLLOWER_COUNT);

		initEEnum(distanceUnitEEnum, DistanceUnit.class, "DistanceUnit");
		addEEnumLiteral(distanceUnitEEnum, DistanceUnit.MILES);
		addEEnumLiteral(distanceUnitEEnum, DistanceUnit.KILOMETERS);

		initEEnum(intOperatorsEEnum, IntOperators.class, "IntOperators");
		addEEnumLiteral(intOperatorsEEnum, IntOperators.GT);
		addEEnumLiteral(intOperatorsEEnum, IntOperators.GTE);
		addEEnumLiteral(intOperatorsEEnum, IntOperators.EQ);
		addEEnumLiteral(intOperatorsEEnum, IntOperators.LT);
		addEEnumLiteral(intOperatorsEEnum, IntOperators.LTE);

		// Create resource
		createResource(eNS_URI);
	}

} //TwitterSearchPackageImpl
