/**
 */
package de.hub.modsoft.twittersearch.impl;

import de.hub.modsoft.twittersearch.Model;
import de.hub.modsoft.twittersearch.Search;
import de.hub.modsoft.twittersearch.Twitter;
import de.hub.modsoft.twittersearch.TwitterSearchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link de.hub.modsoft.twittersearch.impl.ModelImpl#getTwitter <em>Twitter</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.impl.ModelImpl#getSearches <em>Searches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getTwitter() <em>Twitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitter()
	 * @generated
	 * @ordered
	 */
	protected Twitter twitter;

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
	public Twitter getTwitter() {
		return twitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTwitter(Twitter newTwitter, NotificationChain msgs) {
		Twitter oldTwitter = twitter;
		twitter = newTwitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.MODEL__TWITTER, oldTwitter, newTwitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTwitter(Twitter newTwitter) {
		if (newTwitter != twitter) {
			NotificationChain msgs = null;
			if (twitter != null)
				msgs = ((InternalEObject)twitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterSearchPackage.MODEL__TWITTER, null, msgs);
			if (newTwitter != null)
				msgs = ((InternalEObject)newTwitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterSearchPackage.MODEL__TWITTER, null, msgs);
			msgs = basicSetTwitter(newTwitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.MODEL__TWITTER, newTwitter, newTwitter));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterSearchPackage.MODEL__TWITTER:
				return basicSetTwitter(null, msgs);
			case TwitterSearchPackage.MODEL__SEARCHES:
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
			case TwitterSearchPackage.MODEL__TWITTER:
				return getTwitter();
			case TwitterSearchPackage.MODEL__SEARCHES:
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
			case TwitterSearchPackage.MODEL__TWITTER:
				setTwitter((Twitter)newValue);
				return;
			case TwitterSearchPackage.MODEL__SEARCHES:
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
			case TwitterSearchPackage.MODEL__TWITTER:
				setTwitter((Twitter)null);
				return;
			case TwitterSearchPackage.MODEL__SEARCHES:
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
			case TwitterSearchPackage.MODEL__TWITTER:
				return twitter != null;
			case TwitterSearchPackage.MODEL__SEARCHES:
				return searches != null && !searches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
