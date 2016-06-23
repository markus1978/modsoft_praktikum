/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.Condition;
import de.hub.modsoft.twittersearch.model.Search;
import de.hub.modsoft.twittersearch.model.SearchOption;
import de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration;
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
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.SearchImpl#getSearchType <em>Search Type</em>}</li>
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
	 * The cached value of the '{@link #getSearchType() <em>Search Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchType()
	 * @generated
	 * @ordered
	 */
	protected TwitterObjectTypeDeclaration searchType;

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
	public TwitterObjectTypeDeclaration getSearchType() {
		if (searchType != null && searchType.eIsProxy()) {
			InternalEObject oldSearchType = (InternalEObject)searchType;
			searchType = (TwitterObjectTypeDeclaration)eResolveProxy(oldSearchType);
			if (searchType != oldSearchType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterSearchPackage.SEARCH__SEARCH_TYPE, oldSearchType, searchType));
			}
		}
		return searchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterObjectTypeDeclaration basicGetSearchType() {
		return searchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchType(TwitterObjectTypeDeclaration newSearchType) {
		TwitterObjectTypeDeclaration oldSearchType = searchType;
		searchType = newSearchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.SEARCH__SEARCH_TYPE, oldSearchType, searchType));
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
			case TwitterSearchPackage.SEARCH__SEARCH_TYPE:
				if (resolve) return getSearchType();
				return basicGetSearchType();
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
			case TwitterSearchPackage.SEARCH__SEARCH_TYPE:
				setSearchType((TwitterObjectTypeDeclaration)newValue);
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
			case TwitterSearchPackage.SEARCH__SEARCH_TYPE:
				setSearchType((TwitterObjectTypeDeclaration)null);
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
			case TwitterSearchPackage.SEARCH__SEARCH_TYPE:
				return searchType != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchImpl
