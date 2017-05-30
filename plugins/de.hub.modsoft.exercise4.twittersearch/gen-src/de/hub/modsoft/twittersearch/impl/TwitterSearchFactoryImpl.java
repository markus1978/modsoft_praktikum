/**
 */
package de.hub.modsoft.twittersearch.impl;

import de.hub.modsoft.twittersearch.*;

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
			case TwitterSearchPackage.BOOLEAN_CONDITION: return createBooleanCondition();
			case TwitterSearchPackage.INT_CONDITION: return createIntCondition();
			case TwitterSearchPackage.KEYWORDS: return createKeywords();
			case TwitterSearchPackage.LOCATION: return createLocation();
			case TwitterSearchPackage.TWITTER_OBJECT_TYPE_DECLARATION: return createTwitterObjectTypeDeclaration();
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION: return createTwitterFieldDeclaration();
			case TwitterSearchPackage.TWITTER: return createTwitter();
			case TwitterSearchPackage.NOT: return createNot();
			case TwitterSearchPackage.AND: return createAnd();
			case TwitterSearchPackage.OR: return createOr();
			case TwitterSearchPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case TwitterSearchPackage.DOT: return createDot();
			case TwitterSearchPackage.FIELD_REFERENCE: return createFieldReference();
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
	public TwitterObjectTypeDeclaration createTwitterObjectTypeDeclaration() {
		TwitterObjectTypeDeclarationImpl twitterObjectTypeDeclaration = new TwitterObjectTypeDeclarationImpl();
		return twitterObjectTypeDeclaration;
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
	public Twitter createTwitter() {
		TwitterImpl twitter = new TwitterImpl();
		return twitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dot createDot() {
		DotImpl dot = new DotImpl();
		return dot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldReference createFieldReference() {
		FieldReferenceImpl fieldReference = new FieldReferenceImpl();
		return fieldReference;
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
