/**
 */
package de.hub.modsoft.twittersearch.util;

import de.hub.modsoft.twittersearch.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage
 * @generated
 */
public class TwitterSearchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TwitterSearchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterSearchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TwitterSearchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwitterSearchSwitch<Adapter> modelSwitch =
		new TwitterSearchSwitch<Adapter>() {
			@Override
			public Adapter caseSearch(Search object) {
				return createSearchAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseBooleanCondition(BooleanCondition object) {
				return createBooleanConditionAdapter();
			}
			@Override
			public Adapter caseIntCondition(IntCondition object) {
				return createIntConditionAdapter();
			}
			@Override
			public Adapter caseSearchOption(SearchOption object) {
				return createSearchOptionAdapter();
			}
			@Override
			public Adapter caseKeywords(Keywords object) {
				return createKeywordsAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.hub.modsoft.twittersearch.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.modsoft.twittersearch.Search
	 * @generated
	 */
	public Adapter createSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.modsoft.twittersearch.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.modsoft.twittersearch.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.modsoft.twittersearch.BooleanCondition <em>Boolean Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.modsoft.twittersearch.BooleanCondition
	 * @generated
	 */
	public Adapter createBooleanConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.modsoft.twittersearch.IntCondition <em>Int Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.modsoft.twittersearch.IntCondition
	 * @generated
	 */
	public Adapter createIntConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.modsoft.twittersearch.SearchOption <em>Search Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.modsoft.twittersearch.SearchOption
	 * @generated
	 */
	public Adapter createSearchOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.modsoft.twittersearch.Keywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.modsoft.twittersearch.Keywords
	 * @generated
	 */
	public Adapter createKeywordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.modsoft.twittersearch.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.modsoft.twittersearch.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TwitterSearchAdapterFactory
