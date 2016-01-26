/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.Search;
import de.hub.modsoft.twittersearch.model.Twitter;
import de.hub.modsoft.twittersearch.model.TwitterObjectType;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.TwitterImpl#getObjectTypes <em>Object Types</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.TwitterImpl#getSearches <em>Searches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwitterImpl extends MinimalEObjectImpl.Container implements Twitter {
	/**
	 * The cached value of the '{@link #getObjectTypes() <em>Object Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TwitterObjectType> objectTypes;

	/**
	 * The cached value of the '{@link #getSearches() <em>Searches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearches()
	 * @generated
	 * @ordered
	 */
	protected EList<Search> searches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.TWITTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TwitterObjectType> getObjectTypes() {
		if (objectTypes == null) {
			objectTypes = new EObjectContainmentEList<TwitterObjectType>(TwitterObjectType.class, this, TwitterSearchPackage.TWITTER__OBJECT_TYPES);
		}
		return objectTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Search> getSearches() {
		if (searches == null) {
			searches = new EObjectContainmentEList<Search>(Search.class, this, TwitterSearchPackage.TWITTER__SEARCHES);
		}
		return searches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void performSearch(Search search) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterSearchPackage.TWITTER__OBJECT_TYPES:
				return ((InternalEList<?>)getObjectTypes()).basicRemove(otherEnd, msgs);
			case TwitterSearchPackage.TWITTER__SEARCHES:
				return ((InternalEList<?>)getSearches()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterSearchPackage.TWITTER__OBJECT_TYPES:
				return getObjectTypes();
			case TwitterSearchPackage.TWITTER__SEARCHES:
				return getSearches();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterSearchPackage.TWITTER__OBJECT_TYPES:
				getObjectTypes().clear();
				getObjectTypes().addAll((Collection<? extends TwitterObjectType>)newValue);
				return;
			case TwitterSearchPackage.TWITTER__SEARCHES:
				getSearches().clear();
				getSearches().addAll((Collection<? extends Search>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TwitterSearchPackage.TWITTER__OBJECT_TYPES:
				getObjectTypes().clear();
				return;
			case TwitterSearchPackage.TWITTER__SEARCHES:
				getSearches().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TwitterSearchPackage.TWITTER__OBJECT_TYPES:
				return objectTypes != null && !objectTypes.isEmpty();
			case TwitterSearchPackage.TWITTER__SEARCHES:
				return searches != null && !searches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TwitterSearchPackage.TWITTER___PERFORM_SEARCH__SEARCH:
				performSearch((Search)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TwitterImpl
