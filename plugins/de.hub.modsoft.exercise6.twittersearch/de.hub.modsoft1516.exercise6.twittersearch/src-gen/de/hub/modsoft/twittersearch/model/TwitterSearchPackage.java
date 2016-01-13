/**
 */
package de.hub.modsoft.twittersearch.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchFactory
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
	String eNS_URI = "http://www.hu-berlin.de/modsoft/TwitterSearch/1.0";

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
	TwitterSearchPackage eINSTANCE = de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.SearchImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Sortation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__SORTATION = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Search For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__SEARCH_FOR = 3;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.FieldExprImpl <em>Field Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.FieldExprImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getFieldExpr()
	 * @generated
	 */
	int FIELD_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Field Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_EXPR__FIELD_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Field Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_EXPR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.ConditionImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.BooleanConditionImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getBooleanCondition()
	 * @generated
	 */
	int BOOLEAN_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.StringConditionImpl <em>String Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.StringConditionImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getStringCondition()
	 * @generated
	 */
	int STRING_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION__FIELD = CONDITION__FIELD;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION__OPERAND = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.IntConditionImpl <em>Int Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.IntConditionImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getIntCondition()
	 * @generated
	 */
	int INT_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.SearchOptionImpl <em>Search Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.SearchOptionImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getSearchOption()
	 * @generated
	 */
	int SEARCH_OPTION = 6;

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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.KeywordsImpl <em>Keywords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.KeywordsImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getKeywords()
	 * @generated
	 */
	int KEYWORDS = 7;

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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.LocationImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 8;

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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.TimeImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 9;

	/**
	 * The feature id for the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__BEFORE = SEARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__AFTER = SEARCH_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = SEARCH_OPTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = SEARCH_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.FieldDeclarationImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getFieldDeclaration()
	 * @generated
	 */
	int FIELD_DECLARATION = 10;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__FIELD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__OBJECT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterImpl <em>Twitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitter()
	 * @generated
	 */
	int TWITTER = 11;

	/**
	 * The feature id for the '<em><b>Object Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__OBJECT_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__SEARCHES = 1;

	/**
	 * The number of structural features of the '<em>Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Perform Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER___PERFORM_SEARCH__SEARCH = 0;

	/**
	 * The number of operations of the '<em>Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterObjectImpl <em>Twitter Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterObjectImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterObject()
	 * @generated
	 */
	int TWITTER_OBJECT = 12;

	/**
	 * The number of structural features of the '<em>Twitter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Twitter Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterObjectTypeImpl <em>Twitter Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterObjectTypeImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterObjectType()
	 * @generated
	 */
	int TWITTER_OBJECT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Twitter Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Twitter Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.DistanceUnit <em>Distance Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.DistanceUnit
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getDistanceUnit()
	 * @generated
	 */
	int DISTANCE_UNIT = 14;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.FieldTypes <em>Field Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.FieldTypes
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getFieldTypes()
	 * @generated
	 */
	int FIELD_TYPES = 15;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.StringOperators <em>String Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.StringOperators
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getStringOperators()
	 * @generated
	 */
	int STRING_OPERATORS = 16;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.IntOperators <em>Int Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.IntOperators
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getIntOperators()
	 * @generated
	 */
	int INT_OPERATORS = 17;


	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.model.Search#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Search#getConditions()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.model.Search#getSortation <em>Sortation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sortation</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Search#getSortation()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Sortation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.model.Search#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Search#getOptions()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Options();

	/**
	 * Returns the meta object for the reference '{@link de.hub.modsoft.twittersearch.model.Search#getSearchFor <em>Search For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Search For</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Search#getSearchFor()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_SearchFor();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.FieldExpr <em>Field Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Expr</em>'.
	 * @see de.hub.modsoft.twittersearch.model.FieldExpr
	 * @generated
	 */
	EClass getFieldExpr();

	/**
	 * Returns the meta object for the reference '{@link de.hub.modsoft.twittersearch.model.FieldExpr#getFieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.model.FieldExpr#getFieldDeclaration()
	 * @see #getFieldExpr()
	 * @generated
	 */
	EReference getFieldExpr_FieldDeclaration();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.model.Condition#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Condition#getField()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Field();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.BooleanCondition <em>Boolean Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Condition</em>'.
	 * @see de.hub.modsoft.twittersearch.model.BooleanCondition
	 * @generated
	 */
	EClass getBooleanCondition();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.StringCondition <em>String Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Condition</em>'.
	 * @see de.hub.modsoft.twittersearch.model.StringCondition
	 * @generated
	 */
	EClass getStringCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.StringCondition#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operand</em>'.
	 * @see de.hub.modsoft.twittersearch.model.StringCondition#getOperand()
	 * @see #getStringCondition()
	 * @generated
	 */
	EAttribute getStringCondition_Operand();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.StringCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.hub.modsoft.twittersearch.model.StringCondition#getOperator()
	 * @see #getStringCondition()
	 * @generated
	 */
	EAttribute getStringCondition_Operator();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.IntCondition <em>Int Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Condition</em>'.
	 * @see de.hub.modsoft.twittersearch.model.IntCondition
	 * @generated
	 */
	EClass getIntCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.IntCondition#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operand</em>'.
	 * @see de.hub.modsoft.twittersearch.model.IntCondition#getOperand()
	 * @see #getIntCondition()
	 * @generated
	 */
	EAttribute getIntCondition_Operand();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.IntCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.hub.modsoft.twittersearch.model.IntCondition#getOperator()
	 * @see #getIntCondition()
	 * @generated
	 */
	EAttribute getIntCondition_Operator();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.SearchOption <em>Search Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Option</em>'.
	 * @see de.hub.modsoft.twittersearch.model.SearchOption
	 * @generated
	 */
	EClass getSearchOption();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.Keywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keywords</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Keywords
	 * @generated
	 */
	EClass getKeywords();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.modsoft.twittersearch.model.Keywords#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Keywords#getKeywords()
	 * @see #getKeywords()
	 * @generated
	 */
	EAttribute getKeywords_Keywords();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.Location#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Location#getLon()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lon();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.Location#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Location#getLat()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.Location#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Location#getRadius()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Radius();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.Location#getRadiusUnit <em>Radius Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius Unit</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Location#getRadiusUnit()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_RadiusUnit();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.Time#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Time#getBefore()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Before();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.Time#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Time#getAfter()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_After();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.FieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.model.FieldDeclaration
	 * @generated
	 */
	EClass getFieldDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Type</em>'.
	 * @see de.hub.modsoft.twittersearch.model.FieldDeclaration#getFieldType()
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	EAttribute getFieldDeclaration_FieldType();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.modsoft.twittersearch.model.FieldDeclaration#getName()
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	EAttribute getFieldDeclaration_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object Type</em>'.
	 * @see de.hub.modsoft.twittersearch.model.FieldDeclaration#getObjectType()
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	EReference getFieldDeclaration_ObjectType();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Twitter
	 * @generated
	 */
	EClass getTwitter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.model.Twitter#getObjectTypes <em>Object Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Types</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Twitter#getObjectTypes()
	 * @see #getTwitter()
	 * @generated
	 */
	EReference getTwitter_ObjectTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.model.Twitter#getSearches <em>Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Searches</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Twitter#getSearches()
	 * @see #getTwitter()
	 * @generated
	 */
	EReference getTwitter_Searches();

	/**
	 * Returns the meta object for the '{@link de.hub.modsoft.twittersearch.model.Twitter#performSearch(de.hub.modsoft.twittersearch.model.Search) <em>Perform Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Search</em>' operation.
	 * @see de.hub.modsoft.twittersearch.model.Twitter#performSearch(de.hub.modsoft.twittersearch.model.Search)
	 * @generated
	 */
	EOperation getTwitter__PerformSearch__Search();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.TwitterObject <em>Twitter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Object</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterObject
	 * @generated
	 */
	EClass getTwitterObject();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.TwitterObjectType <em>Twitter Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Object Type</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterObjectType
	 * @generated
	 */
	EClass getTwitterObjectType();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.TwitterObjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterObjectType#getName()
	 * @see #getTwitterObjectType()
	 * @generated
	 */
	EAttribute getTwitterObjectType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.model.TwitterObjectType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterObjectType#getFields()
	 * @see #getTwitterObjectType()
	 * @generated
	 */
	EReference getTwitterObjectType_Fields();

	/**
	 * Returns the meta object for enum '{@link de.hub.modsoft.twittersearch.model.DistanceUnit <em>Distance Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distance Unit</em>'.
	 * @see de.hub.modsoft.twittersearch.model.DistanceUnit
	 * @generated
	 */
	EEnum getDistanceUnit();

	/**
	 * Returns the meta object for enum '{@link de.hub.modsoft.twittersearch.model.FieldTypes <em>Field Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Types</em>'.
	 * @see de.hub.modsoft.twittersearch.model.FieldTypes
	 * @generated
	 */
	EEnum getFieldTypes();

	/**
	 * Returns the meta object for enum '{@link de.hub.modsoft.twittersearch.model.StringOperators <em>String Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Operators</em>'.
	 * @see de.hub.modsoft.twittersearch.model.StringOperators
	 * @generated
	 */
	EEnum getStringOperators();

	/**
	 * Returns the meta object for enum '{@link de.hub.modsoft.twittersearch.model.IntOperators <em>Int Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Int Operators</em>'.
	 * @see de.hub.modsoft.twittersearch.model.IntOperators
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
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.SearchImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__CONDITIONS = eINSTANCE.getSearch_Conditions();

		/**
		 * The meta object literal for the '<em><b>Sortation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__SORTATION = eINSTANCE.getSearch_Sortation();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__OPTIONS = eINSTANCE.getSearch_Options();

		/**
		 * The meta object literal for the '<em><b>Search For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__SEARCH_FOR = eINSTANCE.getSearch_SearchFor();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.FieldExprImpl <em>Field Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.FieldExprImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getFieldExpr()
		 * @generated
		 */
		EClass FIELD_EXPR = eINSTANCE.getFieldExpr();

		/**
		 * The meta object literal for the '<em><b>Field Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_EXPR__FIELD_DECLARATION = eINSTANCE.getFieldExpr_FieldDeclaration();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.ConditionImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__FIELD = eINSTANCE.getCondition_Field();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.BooleanConditionImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getBooleanCondition()
		 * @generated
		 */
		EClass BOOLEAN_CONDITION = eINSTANCE.getBooleanCondition();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.StringConditionImpl <em>String Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.StringConditionImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getStringCondition()
		 * @generated
		 */
		EClass STRING_CONDITION = eINSTANCE.getStringCondition();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONDITION__OPERAND = eINSTANCE.getStringCondition_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONDITION__OPERATOR = eINSTANCE.getStringCondition_Operator();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.IntConditionImpl <em>Int Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.IntConditionImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getIntCondition()
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
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.SearchOptionImpl <em>Search Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.SearchOptionImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getSearchOption()
		 * @generated
		 */
		EClass SEARCH_OPTION = eINSTANCE.getSearchOption();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.KeywordsImpl <em>Keywords</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.KeywordsImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getKeywords()
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
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.LocationImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getLocation()
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
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.TimeImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__BEFORE = eINSTANCE.getTime_Before();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__AFTER = eINSTANCE.getTime_After();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.FieldDeclarationImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getFieldDeclaration()
		 * @generated
		 */
		EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

		/**
		 * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DECLARATION__FIELD_TYPE = eINSTANCE.getFieldDeclaration_FieldType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DECLARATION__NAME = eINSTANCE.getFieldDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECLARATION__OBJECT_TYPE = eINSTANCE.getFieldDeclaration_ObjectType();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterImpl <em>Twitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitter()
		 * @generated
		 */
		EClass TWITTER = eINSTANCE.getTwitter();

		/**
		 * The meta object literal for the '<em><b>Object Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER__OBJECT_TYPES = eINSTANCE.getTwitter_ObjectTypes();

		/**
		 * The meta object literal for the '<em><b>Searches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER__SEARCHES = eINSTANCE.getTwitter_Searches();

		/**
		 * The meta object literal for the '<em><b>Perform Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TWITTER___PERFORM_SEARCH__SEARCH = eINSTANCE.getTwitter__PerformSearch__Search();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterObjectImpl <em>Twitter Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterObjectImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterObject()
		 * @generated
		 */
		EClass TWITTER_OBJECT = eINSTANCE.getTwitterObject();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterObjectTypeImpl <em>Twitter Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterObjectTypeImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterObjectType()
		 * @generated
		 */
		EClass TWITTER_OBJECT_TYPE = eINSTANCE.getTwitterObjectType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_OBJECT_TYPE__NAME = eINSTANCE.getTwitterObjectType_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER_OBJECT_TYPE__FIELDS = eINSTANCE.getTwitterObjectType_Fields();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.DistanceUnit <em>Distance Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.DistanceUnit
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getDistanceUnit()
		 * @generated
		 */
		EEnum DISTANCE_UNIT = eINSTANCE.getDistanceUnit();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.FieldTypes <em>Field Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.FieldTypes
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getFieldTypes()
		 * @generated
		 */
		EEnum FIELD_TYPES = eINSTANCE.getFieldTypes();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.StringOperators <em>String Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.StringOperators
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getStringOperators()
		 * @generated
		 */
		EEnum STRING_OPERATORS = eINSTANCE.getStringOperators();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.IntOperators <em>Int Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.IntOperators
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getIntOperators()
		 * @generated
		 */
		EEnum INT_OPERATORS = eINSTANCE.getIntOperators();

	}

} //TwitterSearchPackage
