/**
 */
package de.hub.modsoft.twittersearch.impl;

import de.hub.modsoft.twittersearch.FieldReference;
import de.hub.modsoft.twittersearch.TwitterFieldDeclaration;
import de.hub.modsoft.twittersearch.TwitterSearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.impl.FieldReferenceImpl#getFieldDeclaration <em>Field Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldReferenceImpl extends FieldExpressionImpl implements FieldReference {
	/**
	 * The cached value of the '{@link #getFieldDeclaration() <em>Field Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldDeclaration()
	 * @generated
	 * @ordered
	 */
	protected TwitterFieldDeclaration fieldDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.FIELD_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterFieldDeclaration getFieldDeclaration() {
		if (fieldDeclaration != null && fieldDeclaration.eIsProxy()) {
			InternalEObject oldFieldDeclaration = (InternalEObject)fieldDeclaration;
			fieldDeclaration = (TwitterFieldDeclaration)eResolveProxy(oldFieldDeclaration);
			if (fieldDeclaration != oldFieldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterSearchPackage.FIELD_REFERENCE__FIELD_DECLARATION, oldFieldDeclaration, fieldDeclaration));
			}
		}
		return fieldDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterFieldDeclaration basicGetFieldDeclaration() {
		return fieldDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldDeclaration(TwitterFieldDeclaration newFieldDeclaration) {
		TwitterFieldDeclaration oldFieldDeclaration = fieldDeclaration;
		fieldDeclaration = newFieldDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.FIELD_REFERENCE__FIELD_DECLARATION, oldFieldDeclaration, fieldDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterSearchPackage.FIELD_REFERENCE__FIELD_DECLARATION:
				if (resolve) return getFieldDeclaration();
				return basicGetFieldDeclaration();
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
			case TwitterSearchPackage.FIELD_REFERENCE__FIELD_DECLARATION:
				setFieldDeclaration((TwitterFieldDeclaration)newValue);
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
			case TwitterSearchPackage.FIELD_REFERENCE__FIELD_DECLARATION:
				setFieldDeclaration((TwitterFieldDeclaration)null);
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
			case TwitterSearchPackage.FIELD_REFERENCE__FIELD_DECLARATION:
				return fieldDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldReferenceImpl
