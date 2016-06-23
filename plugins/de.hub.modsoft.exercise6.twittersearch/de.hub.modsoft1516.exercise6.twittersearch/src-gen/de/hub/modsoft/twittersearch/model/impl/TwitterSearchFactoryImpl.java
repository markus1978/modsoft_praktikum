/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case TwitterSearchPackage.SEARCH: return createSearch();
			case TwitterSearchPackage.FIELD_EXPR: return createFieldExpr();
			case TwitterSearchPackage.BOOLEAN_CONDITION: return createBooleanCondition();
			case TwitterSearchPackage.INT_CONDITION: return createIntCondition();
			case TwitterSearchPackage.KEYWORDS: return createKeywords();
			case TwitterSearchPackage.LOCATION: return createLocation();
			case TwitterSearchPackage.TIME: return createTime();
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION: return createTwitterFieldDeclaration();
			case TwitterSearchPackage.TWITTER_OBJECT_TYPE_DECLARATION: return createTwitterObjectTypeDeclaration();
			case TwitterSearchPackage.TWITTER_TYPE: return createTwitterType();
			case TwitterSearchPackage.TWITTER_PRIMITIVE_TYPE: return createTwitterPrimitiveType();
			case TwitterSearchPackage.MODEL: return createModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TwitterSearchPackage.DISTANCE_UNIT:
				return createDistanceUnitFromString(eDataType, initialValue);
			case TwitterSearchPackage.FIELD_TYPES:
				return createFieldTypesFromString(eDataType, initialValue);
			case TwitterSearchPackage.INT_OPERATORS:
				return createIntOperatorsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TwitterSearchPackage.DISTANCE_UNIT:
				return convertDistanceUnitToString(eDataType, instanceValue);
			case TwitterSearchPackage.FIELD_TYPES:
				return convertFieldTypesToString(eDataType, instanceValue);
			case TwitterSearchPackage.INT_OPERATORS:
				return convertIntOperatorsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search createSearch() {
		SearchImpl search = new SearchImpl();
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldExpr createFieldExpr() {
		FieldExprImpl fieldExpr = new FieldExprImpl();
		return fieldExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanCondition createBooleanCondition() {
		BooleanConditionImpl booleanCondition = new BooleanConditionImpl();
		return booleanCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntCondition createIntCondition() {
		IntConditionImpl intCondition = new IntConditionImpl();
		return intCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keywords createKeywords() {
		KeywordsImpl keywords = new KeywordsImpl();
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterFieldDeclaration createTwitterFieldDeclaration() {
		TwitterFieldDeclarationImpl twitterFieldDeclaration = new TwitterFieldDeclarationImpl();
		return twitterFieldDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterObjectTypeDeclaration createTwitterObjectTypeDeclaration() {
		TwitterObjectTypeDeclarationImpl twitterObjectTypeDeclaration = new TwitterObjectTypeDeclarationImpl();
		return twitterObjectTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterType createTwitterType() {
		TwitterTypeImpl twitterType = new TwitterTypeImpl();
		return twitterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterPrimitiveType createTwitterPrimitiveType() {
		TwitterPrimitiveTypeImpl twitterPrimitiveType = new TwitterPrimitiveTypeImpl();
		return twitterPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceUnit createDistanceUnitFromString(EDataType eDataType, String initialValue) {
		DistanceUnit result = DistanceUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTypes createFieldTypesFromString(EDataType eDataType, String initialValue) {
		FieldTypes result = FieldTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFieldTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntOperators createIntOperatorsFromString(EDataType eDataType, String initialValue) {
		IntOperators result = IntOperators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
