/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.Condition;
import de.hub.modsoft.twittersearch.model.Search;
import de.hub.modsoft.twittersearch.model.SearchOption;
import de.hub.modsoft.twittersearch.model.TwitterObjectType;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;

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
 * An implementation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.SearchImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.SearchImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.SearchImpl#getSearchFor <em>Search For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchImpl extends MinimalEObjectImpl.Container implements Search {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchOption> options;

	/**
	 * The cached value of the '{@link #getSearchFor() <em>Search For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchFor()
	 * @generated
	 * @ordered
	 */
	protected TwitterObjectType searchFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, TwitterSearchPackage.SEARCH__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SearchOption> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<SearchOption>(SearchOption.class, this, TwitterSearchPackage.SEARCH__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterObjectType getSearchFor() {
		if (searchFor != null && searchFor.eIsProxy()) {
			InternalEObject oldSearchFor = (InternalEObject)searchFor;
			searchFor = (TwitterObjectType)eResolveProxy(oldSearchFor);
			if (searchFor != oldSearchFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterSearchPackage.SEARCH__SEARCH_FOR, oldSearchFor, searchFor));
			}
		}
		return searchFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterObjectType basicGetSearchFor() {
		return searchFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchFor(TwitterObjectType newSearchFor) {
		TwitterObjectType oldSearchFor = searchFor;
		searchFor = newSearchFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.SEARCH__SEARCH_FOR, oldSearchFor, searchFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterSearchPackage.SEARCH__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case TwitterSearchPackage.SEARCH__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case TwitterSearchPackage.SEARCH__CONDITIONS:
				return getConditions();
			case TwitterSearchPackage.SEARCH__OPTIONS:
				return getOptions();
			case TwitterSearchPackage.SEARCH__SEARCH_FOR:
				if (resolve) return getSearchFor();
				return basicGetSearchFor();
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
			case TwitterSearchPackage.SEARCH__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case TwitterSearchPackage.SEARCH__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends SearchOption>)newValue);
				return;
			case TwitterSearchPackage.SEARCH__SEARCH_FOR:
				setSearchFor((TwitterObjectType)newValue);
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
			case TwitterSearchPackage.SEARCH__CONDITIONS:
				getConditions().clear();
				return;
			case TwitterSearchPackage.SEARCH__OPTIONS:
				getOptions().clear();
				return;
			case TwitterSearchPackage.SEARCH__SEARCH_FOR:
				setSearchFor((TwitterObjectType)null);
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
			case TwitterSearchPackage.SEARCH__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case TwitterSearchPackage.SEARCH__OPTIONS:
				return options != null && !options.isEmpty();
			case TwitterSearchPackage.SEARCH__SEARCH_FOR:
				return searchFor != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchImpl
