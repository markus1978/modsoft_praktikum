/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.FieldDeclaration;
import de.hub.modsoft.twittersearch.model.FieldTypes;
import de.hub.modsoft.twittersearch.model.TwitterObjectType;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.FieldDeclarationImpl#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.FieldDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.FieldDeclarationImpl#getObjectType <em>Object Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDeclarationImpl extends MinimalEObjectImpl.Container implements FieldDeclaration {
	/**
	 * The default value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected static final FieldTypes FIELD_TYPE_EDEFAULT = FieldTypes.INT;

	/**
	 * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected FieldTypes fieldType = FIELD_TYPE_EDEFAULT;

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
	protected FieldDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.FIELD_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTypes getFieldType() {
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldType(FieldTypes newFieldType) {
		FieldTypes oldFieldType = fieldType;
		fieldType = newFieldType == null ? FIELD_TYPE_EDEFAULT : newFieldType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.FIELD_DECLARATION__FIELD_TYPE, oldFieldType, fieldType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.FIELD_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterObjectType getObjectType() {
		if (eContainerFeatureID() != TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE) return null;
		return (TwitterObjectType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectType(TwitterObjectType newObjectType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newObjectType, TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(TwitterObjectType newObjectType) {
		if (newObjectType != eInternalContainer() || (eContainerFeatureID() != TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE && newObjectType != null)) {
			if (EcoreUtil.isAncestor(this, newObjectType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newObjectType != null)
				msgs = ((InternalEObject)newObjectType).eInverseAdd(this, TwitterSearchPackage.TWITTER_OBJECT_TYPE__FIELDS, TwitterObjectType.class, msgs);
			msgs = basicSetObjectType(newObjectType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE, newObjectType, newObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetObjectType((TwitterObjectType)otherEnd, msgs);
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
			case TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE:
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
			case TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE:
				return eInternalContainer().eInverseRemove(this, TwitterSearchPackage.TWITTER_OBJECT_TYPE__FIELDS, TwitterObjectType.class, msgs);
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
			case TwitterSearchPackage.FIELD_DECLARATION__FIELD_TYPE:
				return getFieldType();
			case TwitterSearchPackage.FIELD_DECLARATION__NAME:
				return getName();
			case TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE:
				return getObjectType();
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
			case TwitterSearchPackage.FIELD_DECLARATION__FIELD_TYPE:
				setFieldType((FieldTypes)newValue);
				return;
			case TwitterSearchPackage.FIELD_DECLARATION__NAME:
				setName((String)newValue);
				return;
			case TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE:
				setObjectType((TwitterObjectType)newValue);
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
			case TwitterSearchPackage.FIELD_DECLARATION__FIELD_TYPE:
				setFieldType(FIELD_TYPE_EDEFAULT);
				return;
			case TwitterSearchPackage.FIELD_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE:
				setObjectType((TwitterObjectType)null);
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
			case TwitterSearchPackage.FIELD_DECLARATION__FIELD_TYPE:
				return fieldType != FIELD_TYPE_EDEFAULT;
			case TwitterSearchPackage.FIELD_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TwitterSearchPackage.FIELD_DECLARATION__OBJECT_TYPE:
				return getObjectType() != null;
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
		result.append(" (fieldType: ");
		result.append(fieldType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FieldDeclarationImpl
