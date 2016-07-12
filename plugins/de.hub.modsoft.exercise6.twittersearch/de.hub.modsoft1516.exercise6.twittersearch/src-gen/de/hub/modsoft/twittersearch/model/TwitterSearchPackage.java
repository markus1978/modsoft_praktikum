/**
 */
package de.hub.modsoft.twittersearch.model;

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
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Search Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__SEARCH_TYPE = 2;

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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.ConditionImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Field Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FIELD_DECLARATION = 0;

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
	int BOOLEAN_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Field Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__FIELD_DECLARATION = CONDITION__FIELD_DECLARATION;

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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.IntConditionImpl <em>Int Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.IntConditionImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getIntCondition()
	 * @generated
	 */
	int INT_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Field Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONDITION__FIELD_DECLARATION = CONDITION__FIELD_DECLARATION;

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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.KeywordsImpl <em>Keywords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.KeywordsImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getKeywords()
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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.LocationImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getLocation()
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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.TimeImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 7;

	/**
	 * The feature id for the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__BEFORE = SEARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = SEARCH_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = SEARCH_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterFieldDeclarationImpl <em>Twitter Field Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterFieldDeclarationImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterFieldDeclaration()
	 * @generated
	 */
	int TWITTER_FIELD_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FIELD_DECLARATION__OBJECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FIELD_DECLARATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FIELD_DECLARATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Twitter Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FIELD_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Twitter Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FIELD_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterTypeDeclarationImpl <em>Twitter Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterTypeDeclarationImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterTypeDeclaration()
	 * @generated
	 */
	int TWITTER_TYPE_DECLARATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_TYPE_DECLARATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Twitter Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_TYPE_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Twitter Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_TYPE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterObjectTypeDeclarationImpl <em>Twitter Object Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterObjectTypeDeclarationImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterObjectTypeDeclaration()
	 * @generated
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION__NAME = TWITTER_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION__FIELDS = TWITTER_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Twitter Object Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION_FEATURE_COUNT = TWITTER_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Twitter Object Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION_OPERATION_COUNT = TWITTER_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterPrimitiveTypeDeclarationImpl <em>Twitter Primitive Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterPrimitiveTypeDeclarationImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterPrimitiveTypeDeclaration()
	 * @generated
	 */
	int TWITTER_PRIMITIVE_TYPE_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_PRIMITIVE_TYPE_DECLARATION__NAME = TWITTER_TYPE_DECLARATION__NAME;

	/**
	 * The number of structural features of the '<em>Twitter Primitive Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_PRIMITIVE_TYPE_DECLARATION_FEATURE_COUNT = TWITTER_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Twitter Primitive Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_PRIMITIVE_TYPE_DECLARATION_OPERATION_COUNT = TWITTER_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.impl.ModelImpl
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 12;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SEARCHES = 0;

	/**
	 * The feature id for the '<em><b>Twitter Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TWITTER_TYPES = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.DistanceUnit <em>Distance Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.DistanceUnit
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getDistanceUnit()
	 * @generated
	 */
	int DISTANCE_UNIT = 13;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.FieldTypes <em>Field Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.FieldTypes
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getFieldTypes()
	 * @generated
	 */
	int FIELD_TYPES = 14;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.model.IntOperators <em>Int Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.model.IntOperators
	 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getIntOperators()
	 * @generated
	 */
	int INT_OPERATORS = 15;


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
	 * Returns the meta object for the reference '{@link de.hub.modsoft.twittersearch.model.Search#getSearchType <em>Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Search Type</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Search#getSearchType()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_SearchType();

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
	 * Returns the meta object for the reference '{@link de.hub.modsoft.twittersearch.model.Condition#getFieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Condition#getFieldDeclaration()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_FieldDeclaration();

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
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration <em>Twitter Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Field Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration
	 * @generated
	 */
	EClass getTwitterFieldDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object Type</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getObjectType()
	 * @see #getTwitterFieldDeclaration()
	 * @generated
	 */
	EReference getTwitterFieldDeclaration_ObjectType();

	/**
	 * Returns the meta object for the reference '{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getType()
	 * @see #getTwitterFieldDeclaration()
	 * @generated
	 */
	EReference getTwitterFieldDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getName()
	 * @see #getTwitterFieldDeclaration()
	 * @generated
	 */
	EAttribute getTwitterFieldDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration <em>Twitter Object Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Object Type Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration
	 * @generated
	 */
	EClass getTwitterObjectTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration#getFields()
	 * @see #getTwitterObjectTypeDeclaration()
	 * @generated
	 */
	EReference getTwitterObjectTypeDeclaration_Fields();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.TwitterTypeDeclaration <em>Twitter Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Type Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterTypeDeclaration
	 * @generated
	 */
	EClass getTwitterTypeDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.model.TwitterTypeDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterTypeDeclaration#getName()
	 * @see #getTwitterTypeDeclaration()
	 * @generated
	 */
	EAttribute getTwitterTypeDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.TwitterPrimitiveTypeDeclaration <em>Twitter Primitive Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Primitive Type Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.model.TwitterPrimitiveTypeDeclaration
	 * @generated
	 */
	EClass getTwitterPrimitiveTypeDeclaration();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.model.Model#getSearches <em>Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Searches</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Model#getSearches()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Searches();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.model.Model#getTwitterTypes <em>Twitter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Twitter Types</em>'.
	 * @see de.hub.modsoft.twittersearch.model.Model#getTwitterTypes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_TwitterTypes();

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
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__OPTIONS = eINSTANCE.getSearch_Options();

		/**
		 * The meta object literal for the '<em><b>Search Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__SEARCH_TYPE = eINSTANCE.getSearch_SearchType();

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
		 * The meta object literal for the '<em><b>Field Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__FIELD_DECLARATION = eINSTANCE.getCondition_FieldDeclaration();

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
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterFieldDeclarationImpl <em>Twitter Field Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterFieldDeclarationImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterFieldDeclaration()
		 * @generated
		 */
		EClass TWITTER_FIELD_DECLARATION = eINSTANCE.getTwitterFieldDeclaration();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER_FIELD_DECLARATION__OBJECT_TYPE = eINSTANCE.getTwitterFieldDeclaration_ObjectType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER_FIELD_DECLARATION__TYPE = eINSTANCE.getTwitterFieldDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_FIELD_DECLARATION__NAME = eINSTANCE.getTwitterFieldDeclaration_Name();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterObjectTypeDeclarationImpl <em>Twitter Object Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterObjectTypeDeclarationImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterObjectTypeDeclaration()
		 * @generated
		 */
		EClass TWITTER_OBJECT_TYPE_DECLARATION = eINSTANCE.getTwitterObjectTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER_OBJECT_TYPE_DECLARATION__FIELDS = eINSTANCE.getTwitterObjectTypeDeclaration_Fields();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterTypeDeclarationImpl <em>Twitter Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterTypeDeclarationImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterTypeDeclaration()
		 * @generated
		 */
		EClass TWITTER_TYPE_DECLARATION = eINSTANCE.getTwitterTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_TYPE_DECLARATION__NAME = eINSTANCE.getTwitterTypeDeclaration_Name();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.TwitterPrimitiveTypeDeclarationImpl <em>Twitter Primitive Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterPrimitiveTypeDeclarationImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getTwitterPrimitiveTypeDeclaration()
		 * @generated
		 */
		EClass TWITTER_PRIMITIVE_TYPE_DECLARATION = eINSTANCE.getTwitterPrimitiveTypeDeclaration();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.model.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.model.impl.ModelImpl
		 * @see de.hub.modsoft.twittersearch.model.impl.TwitterSearchPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Searches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SEARCHES = eINSTANCE.getModel_Searches();

		/**
		 * The meta object literal for the '<em><b>Twitter Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TWITTER_TYPES = eINSTANCE.getModel_TwitterTypes();

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
