/**
 */
package de.hub.modsoft.twittersearch.impl;

import de.hub.modsoft.twittersearch.And;
import de.hub.modsoft.twittersearch.BooleanBinaryOp;
import de.hub.modsoft.twittersearch.BooleanCondition;
import de.hub.modsoft.twittersearch.BooleanExpression;
import de.hub.modsoft.twittersearch.Condition;
import de.hub.modsoft.twittersearch.DistanceUnit;
import de.hub.modsoft.twittersearch.Dot;
import de.hub.modsoft.twittersearch.FieldExpression;
import de.hub.modsoft.twittersearch.FieldReference;
import de.hub.modsoft.twittersearch.IntCondition;
import de.hub.modsoft.twittersearch.IntOperators;
import de.hub.modsoft.twittersearch.Keywords;
import de.hub.modsoft.twittersearch.Location;
import de.hub.modsoft.twittersearch.Model;
import de.hub.modsoft.twittersearch.Not;
import de.hub.modsoft.twittersearch.Or;
import de.hub.modsoft.twittersearch.PrimitiveType;
import de.hub.modsoft.twittersearch.Search;
import de.hub.modsoft.twittersearch.SearchOption;
import de.hub.modsoft.twittersearch.Twitter;
import de.hub.modsoft.twittersearch.TwitterFieldDeclaration;
import de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration;
import de.hub.modsoft.twittersearch.TwitterSearchFactory;
import de.hub.modsoft.twittersearch.TwitterSearchPackage;
import de.hub.modsoft.twittersearch.Type;

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
	private EClass twitterObjectTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twitterFieldDeclarationEClass = null;

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
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

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
	public EReference getSearch_Condition() {
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
	public EReference getSearch_SearchType() {
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
	public EReference getCondition_FieldExpression() {
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
	public EClass getTwitterObjectTypeDeclaration() {
		return twitterObjectTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwitterObjectTypeDeclaration_Fields() {
		return (EReference)twitterObjectTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwitterFieldDeclaration() {
		return twitterFieldDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwitterFieldDeclaration_Type() {
		return (EReference)twitterFieldDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterFieldDeclaration_Name() {
		return (EAttribute)twitterFieldDeclarationEClass.getEStructuralFeatures().get(1);
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
	public EReference getTwitter_Types() {
		return (EReference)twitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Operand() {
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryOp() {
		return booleanBinaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryOp_Left() {
		return (EReference)booleanBinaryOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryOp_Right() {
		return (EReference)booleanBinaryOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldExpression() {
		return fieldExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDot() {
		return dotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDot_Left() {
		return (EReference)dotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDot_Right() {
		return (EReference)dotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldReference() {
		return fieldReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldReference_FieldDeclaration() {
		return (EReference)fieldReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Twitter() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Searches() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
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
		createEReference(searchEClass, SEARCH__CONDITION);
		createEReference(searchEClass, SEARCH__OPTIONS);
		createEReference(searchEClass, SEARCH__SEARCH_TYPE);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__FIELD_EXPRESSION);

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

		twitterObjectTypeDeclarationEClass = createEClass(TWITTER_OBJECT_TYPE_DECLARATION);
		createEReference(twitterObjectTypeDeclarationEClass, TWITTER_OBJECT_TYPE_DECLARATION__FIELDS);

		twitterFieldDeclarationEClass = createEClass(TWITTER_FIELD_DECLARATION);
		createEReference(twitterFieldDeclarationEClass, TWITTER_FIELD_DECLARATION__TYPE);
		createEAttribute(twitterFieldDeclarationEClass, TWITTER_FIELD_DECLARATION__NAME);

		twitterEClass = createEClass(TWITTER);
		createEReference(twitterEClass, TWITTER__TYPES);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__OPERAND);

		booleanBinaryOpEClass = createEClass(BOOLEAN_BINARY_OP);
		createEReference(booleanBinaryOpEClass, BOOLEAN_BINARY_OP__LEFT);
		createEReference(booleanBinaryOpEClass, BOOLEAN_BINARY_OP__RIGHT);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		fieldExpressionEClass = createEClass(FIELD_EXPRESSION);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		dotEClass = createEClass(DOT);
		createEReference(dotEClass, DOT__LEFT);
		createEReference(dotEClass, DOT__RIGHT);

		fieldReferenceEClass = createEClass(FIELD_REFERENCE);
		createEReference(fieldReferenceEClass, FIELD_REFERENCE__FIELD_DECLARATION);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__TWITTER);
		createEReference(modelEClass, MODEL__SEARCHES);

		// Create enums
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
		conditionEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanConditionEClass.getESuperTypes().add(this.getCondition());
		intConditionEClass.getESuperTypes().add(this.getCondition());
		keywordsEClass.getESuperTypes().add(this.getSearchOption());
		locationEClass.getESuperTypes().add(this.getSearchOption());
		twitterObjectTypeDeclarationEClass.getESuperTypes().add(this.getType());
		notEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanBinaryOpEClass.getESuperTypes().add(this.getBooleanExpression());
		andEClass.getESuperTypes().add(this.getBooleanBinaryOp());
		orEClass.getESuperTypes().add(this.getBooleanBinaryOp());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		dotEClass.getESuperTypes().add(this.getFieldExpression());
		fieldReferenceEClass.getESuperTypes().add(this.getFieldExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(searchEClass, Search.class, "Search", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearch_Condition(), this.getBooleanExpression(), null, "condition", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearch_Options(), this.getSearchOption(), null, "options", null, 0, -1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearch_SearchType(), this.getTwitterObjectTypeDeclaration(), null, "searchType", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_FieldExpression(), this.getFieldExpression(), null, "fieldExpression", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(twitterObjectTypeDeclarationEClass, TwitterObjectTypeDeclaration.class, "TwitterObjectTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTwitterObjectTypeDeclaration_Fields(), this.getTwitterFieldDeclaration(), null, "fields", null, 0, -1, TwitterObjectTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twitterFieldDeclarationEClass, TwitterFieldDeclaration.class, "TwitterFieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTwitterFieldDeclaration_Type(), this.getType(), null, "type", null, 0, 1, TwitterFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterFieldDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, TwitterFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twitterEClass, Twitter.class, "Twitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTwitter_Types(), this.getType(), null, "types", null, 0, -1, Twitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Operand(), this.getBooleanExpression(), null, "operand", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanBinaryOpEClass, BooleanBinaryOp.class, "BooleanBinaryOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanBinaryOp_Left(), this.getBooleanExpression(), null, "left", null, 0, 1, BooleanBinaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanBinaryOp_Right(), this.getBooleanExpression(), null, "right", null, 0, 1, BooleanBinaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldExpressionEClass, FieldExpression.class, "FieldExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dotEClass, Dot.class, "Dot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDot_Left(), this.getFieldExpression(), null, "left", null, 0, 1, Dot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDot_Right(), this.getFieldReference(), null, "right", null, 0, 1, Dot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldReferenceEClass, FieldReference.class, "FieldReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldReference_FieldDeclaration(), this.getTwitterFieldDeclaration(), null, "fieldDeclaration", null, 0, 1, FieldReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Twitter(), this.getTwitter(), null, "twitter", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Searches(), this.getSearch(), null, "searches", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
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
