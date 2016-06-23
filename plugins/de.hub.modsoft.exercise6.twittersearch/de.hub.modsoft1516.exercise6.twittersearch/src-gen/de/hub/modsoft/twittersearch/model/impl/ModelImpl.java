/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.Model;
import de.hub.modsoft.twittersearch.model.Search;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;
import de.hub.modsoft.twittersearch.model.TwitterType;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.ModelImpl#getSearches <em>Searches</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.ModelImpl#getTwitterTypes <em>Twitter Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * The cached value of the '{@link #getTwitterTypes() <em>Twitter Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitterTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TwitterType> twitterTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Search> getSearches() {
		if (searches == null) {
			searches = new EObjectContainmentEList<Search>(Search.class, this, TwitterSearchPackage.MODEL__SEARCHES);
		}
		return searches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TwitterType> getTwitterTypes() {
		if (twitterTypes == null) {
			twitterTypes = new EObjectContainmentEList<TwitterType>(TwitterType.class, this, TwitterSearchPackage.MODEL__TWITTER_TYPES);
		}
		return twitterTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterSearchPackage.MODEL__SEARCHES:
				return ((InternalEList<?>)getSearches()).basicRemove(otherEnd, msgs);
			case TwitterSearchPackage.MODEL__TWITTER_TYPES:
				return ((InternalEList<?>)getTwitterTypes()).basicRemove(otherEnd, msgs);
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
			case TwitterSearchPackage.MODEL__SEARCHES:
				return getSearches();
			case TwitterSearchPackage.MODEL__TWITTER_TYPES:
				return getTwitterTypes();
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
			case TwitterSearchPackage.MODEL__SEARCHES:
				getSearches().clear();
				getSearches().addAll((Collection<? extends Search>)newValue);
				return;
			case TwitterSearchPackage.MODEL__TWITTER_TYPES:
				getTwitterTypes().clear();
				getTwitterTypes().addAll((Collection<? extends TwitterType>)newValue);
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
			case TwitterSearchPackage.MODEL__SEARCHES:
				getSearches().clear();
				return;
			case TwitterSearchPackage.MODEL__TWITTER_TYPES:
				getTwitterTypes().clear();
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
			case TwitterSearchPackage.MODEL__SEARCHES:
				return searches != null && !searches.isEmpty();
			case TwitterSearchPackage.MODEL__TWITTER_TYPES:
				return twitterTypes != null && !twitterTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
