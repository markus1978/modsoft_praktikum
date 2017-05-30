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
	String eNS_URI = "http://www.hu-berlin.de/modsoft/TwitterSearch/Exercise4";

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
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__CONDITION = 0;

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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.BooleanExpressionImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Field Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FIELD_EXPRESSION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Field Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__FIELD_EXPRESSION = CONDITION__FIELD_EXPRESSION;

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
	 * The feature id for the '<em><b>Field Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONDITION__FIELD_EXPRESSION = CONDITION__FIELD_EXPRESSION;

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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.TypeImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.TwitterObjectTypeDeclarationImpl <em>Twitter Object Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.TwitterObjectTypeDeclarationImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getTwitterObjectTypeDeclaration()
	 * @generated
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION__FIELDS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Twitter Object Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Twitter Object Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OBJECT_TYPE_DECLARATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.TwitterFieldDeclarationImpl <em>Twitter Field Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.TwitterFieldDeclarationImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getTwitterFieldDeclaration()
	 * @generated
	 */
	int TWITTER_FIELD_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FIELD_DECLARATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FIELD_DECLARATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Twitter Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FIELD_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Twitter Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FIELD_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.TwitterImpl <em>Twitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.TwitterImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getTwitter()
	 * @generated
	 */
	int TWITTER = 9;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.NotImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 11;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.BooleanBinaryOpImpl <em>Boolean Binary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.BooleanBinaryOpImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getBooleanBinaryOp()
	 * @generated
	 */
	int BOOLEAN_BINARY_OP = 12;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_OP__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_OP__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Binary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_OP_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Binary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_OP_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.AndImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 13;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BOOLEAN_BINARY_OP__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = BOOLEAN_BINARY_OP__RIGHT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOLEAN_BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.OrImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getOr()
	 * @generated
	 */
	int OR = 14;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BOOLEAN_BINARY_OP__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = BOOLEAN_BINARY_OP__RIGHT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BOOLEAN_BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.FieldExpressionImpl <em>Field Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.FieldExpressionImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getFieldExpression()
	 * @generated
	 */
	int FIELD_EXPRESSION = 15;

	/**
	 * The number of structural features of the '<em>Field Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Field Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.PrimitiveTypeImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.DotImpl <em>Dot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.DotImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getDot()
	 * @generated
	 */
	int DOT = 18;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT__LEFT = FIELD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT__RIGHT = FIELD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_FEATURE_COUNT = FIELD_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_OPERATION_COUNT = FIELD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.FieldReferenceImpl <em>Field Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.FieldReferenceImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getFieldReference()
	 * @generated
	 */
	int FIELD_REFERENCE = 19;

	/**
	 * The feature id for the '<em><b>Field Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE__FIELD_DECLARATION = FIELD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_FEATURE_COUNT = FIELD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_REFERENCE_OPERATION_COUNT = FIELD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.impl.ModelImpl
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 20;

	/**
	 * The feature id for the '<em><b>Twitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TWITTER = 0;

	/**
	 * The feature id for the '<em><b>Searches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SEARCHES = 1;

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
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.DistanceUnit <em>Distance Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.DistanceUnit
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getDistanceUnit()
	 * @generated
	 */
	int DISTANCE_UNIT = 21;

	/**
	 * The meta object id for the '{@link de.hub.modsoft.twittersearch.IntOperators <em>Int Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.modsoft.twittersearch.IntOperators
	 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getIntOperators()
	 * @generated
	 */
	int INT_OPERATORS = 22;


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
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.Search#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.hub.modsoft.twittersearch.Search#getCondition()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Condition();

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
	 * Returns the meta object for the reference '{@link de.hub.modsoft.twittersearch.Search#getSearchType <em>Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Search Type</em>'.
	 * @see de.hub.modsoft.twittersearch.Search#getSearchType()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_SearchType();

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
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.Condition#getFieldExpression <em>Field Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Expression</em>'.
	 * @see de.hub.modsoft.twittersearch.Condition#getFieldExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_FieldExpression();

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
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration <em>Twitter Object Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Object Type Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration
	 * @generated
	 */
	EClass getTwitterObjectTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration#getFields()
	 * @see #getTwitterObjectTypeDeclaration()
	 * @generated
	 */
	EReference getTwitterObjectTypeDeclaration_Fields();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.TwitterFieldDeclaration <em>Twitter Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Field Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.TwitterFieldDeclaration
	 * @generated
	 */
	EClass getTwitterFieldDeclaration();

	/**
	 * Returns the meta object for the reference '{@link de.hub.modsoft.twittersearch.TwitterFieldDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.hub.modsoft.twittersearch.TwitterFieldDeclaration#getType()
	 * @see #getTwitterFieldDeclaration()
	 * @generated
	 */
	EReference getTwitterFieldDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.TwitterFieldDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.modsoft.twittersearch.TwitterFieldDeclaration#getName()
	 * @see #getTwitterFieldDeclaration()
	 * @generated
	 */
	EAttribute getTwitterFieldDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter</em>'.
	 * @see de.hub.modsoft.twittersearch.Twitter
	 * @generated
	 */
	EClass getTwitter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.Twitter#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see de.hub.modsoft.twittersearch.Twitter#getTypes()
	 * @see #getTwitter()
	 * @generated
	 */
	EReference getTwitter_Types();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see de.hub.modsoft.twittersearch.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see de.hub.modsoft.twittersearch.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.Not#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.hub.modsoft.twittersearch.Not#getOperand()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Operand();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.BooleanBinaryOp <em>Boolean Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Op</em>'.
	 * @see de.hub.modsoft.twittersearch.BooleanBinaryOp
	 * @generated
	 */
	EClass getBooleanBinaryOp();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.BooleanBinaryOp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.hub.modsoft.twittersearch.BooleanBinaryOp#getLeft()
	 * @see #getBooleanBinaryOp()
	 * @generated
	 */
	EReference getBooleanBinaryOp_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.BooleanBinaryOp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.hub.modsoft.twittersearch.BooleanBinaryOp#getRight()
	 * @see #getBooleanBinaryOp()
	 * @generated
	 */
	EReference getBooleanBinaryOp_Right();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see de.hub.modsoft.twittersearch.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see de.hub.modsoft.twittersearch.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.FieldExpression <em>Field Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Expression</em>'.
	 * @see de.hub.modsoft.twittersearch.FieldExpression
	 * @generated
	 */
	EClass getFieldExpression();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.hub.modsoft.twittersearch.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.modsoft.twittersearch.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.modsoft.twittersearch.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see de.hub.modsoft.twittersearch.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Dot <em>Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot</em>'.
	 * @see de.hub.modsoft.twittersearch.Dot
	 * @generated
	 */
	EClass getDot();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.Dot#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.hub.modsoft.twittersearch.Dot#getLeft()
	 * @see #getDot()
	 * @generated
	 */
	EReference getDot_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.Dot#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.hub.modsoft.twittersearch.Dot#getRight()
	 * @see #getDot()
	 * @generated
	 */
	EReference getDot_Right();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.FieldReference <em>Field Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Reference</em>'.
	 * @see de.hub.modsoft.twittersearch.FieldReference
	 * @generated
	 */
	EClass getFieldReference();

	/**
	 * Returns the meta object for the reference '{@link de.hub.modsoft.twittersearch.FieldReference#getFieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Declaration</em>'.
	 * @see de.hub.modsoft.twittersearch.FieldReference#getFieldDeclaration()
	 * @see #getFieldReference()
	 * @generated
	 */
	EReference getFieldReference_FieldDeclaration();

	/**
	 * Returns the meta object for class '{@link de.hub.modsoft.twittersearch.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.hub.modsoft.twittersearch.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.modsoft.twittersearch.Model#getTwitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Twitter</em>'.
	 * @see de.hub.modsoft.twittersearch.Model#getTwitter()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Twitter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.modsoft.twittersearch.Model#getSearches <em>Searches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Searches</em>'.
	 * @see de.hub.modsoft.twittersearch.Model#getSearches()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Searches();

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
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__CONDITION = eINSTANCE.getSearch_Condition();

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
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.ConditionImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Field Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__FIELD_EXPRESSION = eINSTANCE.getCondition_FieldExpression();

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
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.TwitterObjectTypeDeclarationImpl <em>Twitter Object Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.TwitterObjectTypeDeclarationImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getTwitterObjectTypeDeclaration()
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
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.TwitterFieldDeclarationImpl <em>Twitter Field Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.TwitterFieldDeclarationImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getTwitterFieldDeclaration()
		 * @generated
		 */
		EClass TWITTER_FIELD_DECLARATION = eINSTANCE.getTwitterFieldDeclaration();

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
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.TwitterImpl <em>Twitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.TwitterImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getTwitter()
		 * @generated
		 */
		EClass TWITTER = eINSTANCE.getTwitter();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWITTER__TYPES = eINSTANCE.getTwitter_Types();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.BooleanExpressionImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.NotImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__OPERAND = eINSTANCE.getNot_Operand();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.BooleanBinaryOpImpl <em>Boolean Binary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.BooleanBinaryOpImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getBooleanBinaryOp()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_OP = eINSTANCE.getBooleanBinaryOp();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_OP__LEFT = eINSTANCE.getBooleanBinaryOp_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_OP__RIGHT = eINSTANCE.getBooleanBinaryOp_Right();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.AndImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.OrImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.FieldExpressionImpl <em>Field Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.FieldExpressionImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getFieldExpression()
		 * @generated
		 */
		EClass FIELD_EXPRESSION = eINSTANCE.getFieldExpression();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.TypeImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.PrimitiveTypeImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.DotImpl <em>Dot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.DotImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getDot()
		 * @generated
		 */
		EClass DOT = eINSTANCE.getDot();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT__LEFT = eINSTANCE.getDot_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT__RIGHT = eINSTANCE.getDot_Right();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.FieldReferenceImpl <em>Field Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.FieldReferenceImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getFieldReference()
		 * @generated
		 */
		EClass FIELD_REFERENCE = eINSTANCE.getFieldReference();

		/**
		 * The meta object literal for the '<em><b>Field Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_REFERENCE__FIELD_DECLARATION = eINSTANCE.getFieldReference_FieldDeclaration();

		/**
		 * The meta object literal for the '{@link de.hub.modsoft.twittersearch.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.modsoft.twittersearch.impl.ModelImpl
		 * @see de.hub.modsoft.twittersearch.impl.TwitterSearchPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Twitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TWITTER = eINSTANCE.getModel_Twitter();

		/**
		 * The meta object literal for the '<em><b>Searches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SEARCHES = eINSTANCE.getModel_Searches();

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
