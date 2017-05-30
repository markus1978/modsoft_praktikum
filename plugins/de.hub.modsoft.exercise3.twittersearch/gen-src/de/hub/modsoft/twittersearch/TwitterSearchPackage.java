/**
 */
package de.hub.modsoft.twittersearch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.modsoft.twittersearch.TwitterSearchFactory
 * @model kind="package"
 * @generated
 */
public interface TwitterSearchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "twittersearch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.hu-berlin.de/modsoft/TwitterSearch/Exercise3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "twittersearch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterSearchPackage eINSTANCE = de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.SearchImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.ConditionImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.BooleanConditionImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getBooleanCondition()
	 * @generated
	 */
	int BOOLEAN_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__FIELD = CONDITION__FIELD;

	/**
	 * The number of structural features of the '<em>Boolean Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.IntConditionImpl <em>Int Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.IntConditionImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getIntCondition()
	 * @generated
	 */
	int INT_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONDITION__FIELD = CONDITION__FIELD;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONDITION__OPERAND = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Int Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.SearchOptionImpl <em>Search Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.SearchOptionImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getSearchOption()
	 * @generated
	 */
	int SEARCH_OPTION = 4;

	/**
	 * The number of structural features of the '<em>Search Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_OPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Search Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.KeywordsImpl <em>Keywords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.KeywordsImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getKeywords()
	 * @generated
	 */
	int KEYWORDS = 5;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS__KEYWORDS = SEARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keywords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS_FEATURE_COUNT = SEARCH_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Keywords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDS_OPERATION_COUNT = SEARCH_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.LocationImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LON = SEARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LAT = SEARCH_OPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__RADIUS = SEARCH_OPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Radius Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__RADIUS_UNIT = SEARCH_OPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = SEARCH_OPTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = SEARCH_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.TwitterObjectType <em>Twitter Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.TwitterObjectType
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getTwitterObjectType()
	 * @generated
	 */
	int TWITTER_OBJECT_TYPE = 7;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.Fields <em>Fields</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.Fields
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getFields()
	 * @generated
	 */
	int FIELDS = 8;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.DistanceUnit <em>Distance Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.DistanceUnit
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getDistanceUnit()
	 * @generated
	 */
	int DISTANCE_UNIT = 9;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.IntOperators <em>Int Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.IntOperators
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getIntOperators()
	 * @generated
	 */
	int INT_OPERATORS = 10;


	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see de.hub.modsoft.twittersearch.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.Search#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.hub.modsoft.twittersearch.Search#getType()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.Search#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see de.hub.modsoft.twittersearch.Search#getConditions()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.Search#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see de.hub.modsoft.twittersearch.Search#getOptions()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Options();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see de.hub.modsoft.twittersearch.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.Condition#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see de.hub.modsoft.twittersearch.Condition#getField()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Field();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.BooleanCondition <em>Boolean Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Condition</em>'.
	 * @see de.hub.modsoft.twittersearch.BooleanCondition
	 * @generated
	 */
	EClass getBooleanCondition();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.IntCondition <em>Int Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Condition</em>'.
	 * @see de.hub.modsoft.twittersearch.IntCondition
	 * @generated
	 */
	EClass getIntCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.IntCondition#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operand</em>'.
	 * @see de.hub.modsoft.twittersearch.IntCondition#getOperand()
	 * @see #getIntCondition()
	 * @generated
	 */
	EAttribute getIntCondition_Operand();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.IntCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.hub.modsoft.twittersearch.IntCondition#getOperator()
	 * @see #getIntCondition()
	 * @generated
	 */
	EAttribute getIntCondition_Operator();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.SearchOption <em>Search Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Option</em>'.
	 * @see de.hub.modsoft.twittersearch.SearchOption
	 * @generated
	 */
	EClass getSearchOption();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Keywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keywords</em>'.
	 * @see de.hub.modsoft.twittersearch.Keywords
	 * @generated
	 */
	EClass getKeywords();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.modsoft.twittersearch.Keywords#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see de.hub.modsoft.twittersearch.Keywords#getKeywords()
	 * @see #getKeywords()
	 * @generated
	 */
	EAttribute getKeywords_Keywords();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.hub.modsoft.twittersearch.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.Location#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see de.hub.modsoft.twittersearch.Location#getLon()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lon();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.Location#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see de.hub.modsoft.twittersearch.Location#getLat()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.Location#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see de.hub.modsoft.twittersearch.Location#getRadius()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Radius();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.Location#getRadiusUnit <em>Radius Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius Unit</em>'.
	 * @see de.hub.modsoft.twittersearch.Location#getRadiusUnit()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_RadiusUnit();

	/**
	 * Returns the meta object for enum '{@link de.hub.modsoft.twittersearch.TwitterObjectType <em>Twitter Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Twitter Object Type</em>'.
	 * @see de.hub.modsoft.twittersearch.TwitterObjectType
	 * @generated
	 */
	EEnum getTwitterObjectType();

	/**
	 * Returns the meta object for enum '{@link de.hub.modsoft.twittersearch.Fields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fields</em>'.
	 * @see de.hub.modsoft.twittersearch.Fields
	 * @generated
	 */
	EEnum getFields();

	/**
	 * Returns the meta object for enum '{@link de.hub.modsoft.twittersearch.DistanceUnit <em>Distance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distance Unit</em>'.
	 * @see de.hub.modsoft.twittersearch.DistanceUnit
	 * @generated
	 */
	EEnum getDistanceUnit();

	/**
	 * Returns the meta object for enum '{@link de.hub.modsoft.twittersearch.IntOperators <em>Int Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Int Operators</em>'.
	 * @see de.hub.modsoft.twittersearch.IntOperators
	 * @generated
	 */
	EEnum getIntOperators();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TwitterSearchFactory getTwitterSearchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.SearchImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__TYPE = eINSTANCE.getSearch_Type();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__CONDITIONS = eINSTANCE.getSearch_Conditions();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__OPTIONS = eINSTANCE.getSearch_Options();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.ConditionImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__FIELD = eINSTANCE.getCondition_Field();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.BooleanConditionImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getBooleanCondition()
		 * @generated
		 */
		EClass BOOLEAN_CONDITION = eINSTANCE.getBooleanCondition();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.IntConditionImpl <em>Int Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.IntConditionImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getIntCondition()
		 * @generated
		 */
		EClass INT_CONDITION = eINSTANCE.getIntCondition();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONDITION__OPERAND = eINSTANCE.getIntCondition_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONDITION__OPERATOR = eINSTANCE.getIntCondition_Operator();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.SearchOptionImpl <em>Search Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.SearchOptionImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getSearchOption()
		 * @generated
		 */
		EClass SEARCH_OPTION = eINSTANCE.getSearchOption();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.KeywordsImpl <em>Keywords</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.KeywordsImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getKeywords()
		 * @generated
		 */
		EClass KEYWORDS = eINSTANCE.getKeywords();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORDS__KEYWORDS = eINSTANCE.getKeywords_Keywords();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.LocationImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LON = eINSTANCE.getLocation_Lon();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LAT = eINSTANCE.getLocation_Lat();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__RADIUS = eINSTANCE.getLocation_Radius();

		/**
		 * The meta object literal for the '<em><b>Radius Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__RADIUS_UNIT = eINSTANCE.getLocation_RadiusUnit();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.TwitterObjectType <em>Twitter Object Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.TwitterObjectType
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getTwitterObjectType()
		 * @generated
		 */
		EEnum TWITTER_OBJECT_TYPE = eINSTANCE.getTwitterObjectType();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.Fields <em>Fields</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.Fields
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getFields()
		 * @generated
		 */
		EEnum FIELDS = eINSTANCE.getFields();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.DistanceUnit <em>Distance Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.DistanceUnit
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getDistanceUnit()
		 * @generated
		 */
		EEnum DISTANCE_UNIT = eINSTANCE.getDistanceUnit();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.IntOperators <em>Int Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.IntOperators
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getIntOperators()
		 * @generated
		 */
		EEnum INT_OPERATORS = eINSTANCE.getIntOperators();

	}

} //TwitterSearchPackage
