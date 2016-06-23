/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.BooleanCondition;
import de.hub.modsoft.twittersearch.model.Condition;
import de.hub.modsoft.twittersearch.model.DistanceUnit;
import de.hub.modsoft.twittersearch.model.FieldDeclaration;
import de.hub.modsoft.twittersearch.model.FieldExpr;
import de.hub.modsoft.twittersearch.model.FieldTypes;
import de.hub.modsoft.twittersearch.model.IntCondition;
import de.hub.modsoft.twittersearch.model.IntOperators;
import de.hub.modsoft.twittersearch.model.Keywords;
import de.hub.modsoft.twittersearch.model.Location;
import de.hub.modsoft.twittersearch.model.Search;
import de.hub.modsoft.twittersearch.model.SearchOption;
import de.hub.modsoft.twittersearch.model.Time;
import de.hub.modsoft.twittersearch.model.Twitter;
import de.hub.modsoft.twittersearch.model.TwitterObjectType;
import de.hub.modsoft.twittersearch.model.TwitterSearchFactory;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	private EClass fieldExprEClass = null;

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
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twitterObjectTypeEClass = null;

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
	private EEnum fieldTypesEEnum = null;

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
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#eNS_URI
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
	public EReference getSearch_Conditions() {
		return (EReference)searchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearch_Options() {
		return (EReference)searchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearch_SearchFor() {
		return (EReference)searchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldExpr() {
		return fieldExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldExpr_FieldDeclaration() {
		return (EReference)fieldExprEClass.getEStructuralFeatures().get(0);
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
	public EReference getCondition_Field() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
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
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Before() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDeclaration() {
		return fieldDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDeclaration_FieldType() {
		return (EAttribute)fieldDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDeclaration_Name() {
		return (EAttribute)fieldDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDeclaration_ObjectType() {
		return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwitter() {
		return twitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwitter_ObjectTypes() {
		return (EReference)twitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwitter_Searches() {
		return (EReference)twitterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTwitter__PerformSearch__Search() {
		return twitterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwitterObjectType() {
		return twitterObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterObjectType_Name() {
		return (EAttribute)twitterObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwitterObjectType_Fields() {
		return (EReference)twitterObjectTypeEClass.getEStructuralFeatures().get(1);
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
	public EEnum getFieldTypes() {
		return fieldTypesEEnum;
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
		createEReference(searchEClass, SEARCH__CONDITIONS);
		createEReference(searchEClass, SEARCH__OPTIONS);
		createEReference(searchEClass, SEARCH__SEARCH_FOR);

		fieldExprEClass = createEClass(FIELD_EXPR);
		createEReference(fieldExprEClass, FIELD_EXPR__FIELD_DECLARATION);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__FIELD);

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

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__BEFORE);

		fieldDeclarationEClass = createEClass(FIELD_DECLARATION);
		createEAttribute(fieldDeclarationEClass, FIELD_DECLARATION__FIELD_TYPE);
		createEAttribute(fieldDeclarationEClass, FIELD_DECLARATION__NAME);
		createEReference(fieldDeclarationEClass, FIELD_DECLARATION__OBJECT_TYPE);

		twitterEClass = createEClass(TWITTER);
		createEReference(twitterEClass, TWITTER__OBJECT_TYPES);
		createEReference(twitterEClass, TWITTER__SEARCHES);
		createEOperation(twitterEClass, TWITTER___PERFORM_SEARCH__SEARCH);

		twitterObjectTypeEClass = createEClass(TWITTER_OBJECT_TYPE);
		createEAttribute(twitterObjectTypeEClass, TWITTER_OBJECT_TYPE__NAME);
		createEReference(twitterObjectTypeEClass, TWITTER_OBJECT_TYPE__FIELDS);

		// Create enums
		distanceUnitEEnum = createEEnum(DISTANCE_UNIT);
		fieldTypesEEnum = createEEnum(FIELD_TYPES);
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
		timeEClass.getESuperTypes().add(this.getSearchOption());

		// Initialize classes, features, and operations; add parameters
		initEClass(searchEClass, Search.class, "Search", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearch_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearch_Options(), this.getSearchOption(), null, "options", null, 0, -1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearch_SearchFor(), this.getTwitterObjectType(), null, "searchFor", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldExprEClass, FieldExpr.class, "FieldExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldExpr_FieldDeclaration(), this.getFieldDeclaration(), null, "fieldDeclaration", null, 0, 1, FieldExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Field(), this.getFieldExpr(), null, "field", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Before(), ecorePackage.getEDate(), "before", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldDeclarationEClass, FieldDeclaration.class, "FieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldDeclaration_FieldType(), this.getFieldTypes(), "fieldType", null, 0, 1, FieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, FieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldDeclaration_ObjectType(), this.getTwitterObjectType(), this.getTwitterObjectType_Fields(), "objectType", null, 0, 1, FieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twitterEClass, Twitter.class, "Twitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTwitter_ObjectTypes(), this.getTwitterObjectType(), null, "objectTypes", null, 0, -1, Twitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwitter_Searches(), this.getSearch(), null, "searches", null, 0, -1, Twitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTwitter__PerformSearch__Search(), null, "performSearch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSearch(), "search", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(twitterObjectTypeEClass, TwitterObjectType.class, "TwitterObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwitterObjectType_Name(), ecorePackage.getEString(), "name", null, 0, 1, TwitterObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwitterObjectType_Fields(), this.getFieldDeclaration(), this.getFieldDeclaration_ObjectType(), "fields", null, 0, -1, TwitterObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(distanceUnitEEnum, DistanceUnit.class, "DistanceUnit");
		addEEnumLiteral(distanceUnitEEnum, DistanceUnit.MI);
		addEEnumLiteral(distanceUnitEEnum, DistanceUnit.KM);

		initEEnum(fieldTypesEEnum, FieldTypes.class, "FieldTypes");
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.INT);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.BOOLEAN);

		initEEnum(intOperatorsEEnum, IntOperators.class, "IntOperators");
		addEEnumLiteral(intOperatorsEEnum, IntOperators.GT);
		addEEnumLiteral(intOperatorsEEnum, IntOperators.LT);
		addEEnumLiteral(intOperatorsEEnum, IntOperators.EQ);
		addEEnumLiteral(intOperatorsEEnum, IntOperators.GEQ);
		addEEnumLiteral(intOperatorsEEnum, IntOperators.LEQ);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getSearch_SearchFor(), 
		   source, 
		   new String[] {
			 "name", "fields"
		   });	
		addAnnotation
		  (getFieldExpr_FieldDeclaration(), 
		   source, 
		   new String[] {
			 "name", "fields"
		   });
	}

} //TwitterSearchPackageImpl
