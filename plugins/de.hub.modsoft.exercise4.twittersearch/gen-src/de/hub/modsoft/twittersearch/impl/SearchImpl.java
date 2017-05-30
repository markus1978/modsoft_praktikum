/**
 */
package de.hub.modsoft.twittersearch.impl;

import de.hub.modsoft.twittersearch.BooleanExpression;
import de.hub.modsoft.twittersearch.Search;
import de.hub.modsoft.twittersearch.SearchOption;
import de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration;
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
 * An implementation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.impl.SearchImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.impl.SearchImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.impl.SearchImpl#getSearchType <em>Search Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchImpl extends MinimalEObjectImpl.Container implements Search {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression condition;

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
	public BooleanExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(BooleanExpression newCondition, NotificationChain msgs) {
		BooleanExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.SEARCH__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(BooleanExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterSearchPackage.SEARCH__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterSearchPackage.SEARCH__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.SEARCH__CONDITION, newCondition, newCondition));
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
			case TwitterSearchPackage.SEARCH__CONDITION:
				return basicSetCondition(null, msgs);
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
			case TwitterSearchPackage.SEARCH__CONDITION:
				return getCondition();
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
			case TwitterSearchPackage.SEARCH__CONDITION:
				setCondition((BooleanExpression)newValue);
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
			case TwitterSearchPackage.SEARCH__CONDITION:
				setCondition((BooleanExpression)null);
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
			case TwitterSearchPackage.SEARCH__CONDITION:
				return condition != null;
			case TwitterSearchPackage.SEARCH__OPTIONS:
				return options != null && !options.isEmpty();
			case TwitterSearchPackage.SEARCH__SEARCH_TYPE:
				return searchType != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchImpl
