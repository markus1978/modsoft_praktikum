/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration;
import de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;
import de.hub.modsoft.twittersearch.model.TwitterTypeDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twitter Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.TwitterFieldDeclarationImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.TwitterFieldDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.TwitterFieldDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwitterFieldDeclarationImpl extends MinimalEObjectImpl.Container implements TwitterFieldDeclaration {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TwitterTypeDeclaration type;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwitterFieldDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.TWITTER_FIELD_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterObjectTypeDeclaration getObjectType() {
		if (eContainerFeatureID() != TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE) return null;
		return (TwitterObjectTypeDeclaration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectType(TwitterObjectTypeDeclaration newObjectType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newObjectType, TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(TwitterObjectTypeDeclaration newObjectType) {
		if (newObjectType != eInternalContainer() || (eContainerFeatureID() != TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE && newObjectType != null)) {
			if (EcoreUtil.isAncestor(this, newObjectType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newObjectType != null)
				msgs = ((InternalEObject)newObjectType).eInverseAdd(this, TwitterSearchPackage.TWITTER_OBJECT_TYPE_DECLARATION__FIELDS, TwitterObjectTypeDeclaration.class, msgs);
			msgs = basicSetObjectType(newObjectType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE, newObjectType, newObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterTypeDeclaration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TwitterTypeDeclaration)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterSearchPackage.TWITTER_FIELD_DECLARATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterTypeDeclaration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TwitterTypeDeclaration newType) {
		TwitterTypeDeclaration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.TWITTER_FIELD_DECLARATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.TWITTER_FIELD_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetObjectType((TwitterObjectTypeDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE:
				return basicSetObjectType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE:
				return eInternalContainer().eInverseRemove(this, TwitterSearchPackage.TWITTER_OBJECT_TYPE_DECLARATION__FIELDS, TwitterObjectTypeDeclaration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE:
				return getObjectType();
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE:
				setObjectType((TwitterObjectTypeDeclaration)newValue);
				return;
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__TYPE:
				setType((TwitterTypeDeclaration)newValue);
				return;
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__NAME:
				setName((String)newValue);
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
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE:
				setObjectType((TwitterObjectTypeDeclaration)null);
				return;
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__TYPE:
				setType((TwitterTypeDeclaration)null);
				return;
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
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
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__OBJECT_TYPE:
				return getObjectType() != null;
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__TYPE:
				return type != null;
			case TwitterSearchPackage.TWITTER_FIELD_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TwitterFieldDeclarationImpl
