/**
 */
package de.hub.modsoft.twittersearch.impl;

import de.hub.modsoft.twittersearch.Condition;
import de.hub.modsoft.twittersearch.FieldExpression;
import de.hub.modsoft.twittersearch.TwitterSearchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.impl.ConditionImpl#getFieldExpression <em>Field Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionImpl extends BooleanExpressionImpl implements Condition {
	/**
	 * The cached value of the '{@link #getFieldExpression() <em>Field Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldExpression()
	 * @generated
	 * @ordered
	 */
	protected FieldExpression fieldExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldExpression getFieldExpression() {
		return fieldExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldExpression(FieldExpression newFieldExpression, NotificationChain msgs) {
		FieldExpression oldFieldExpression = fieldExpression;
		fieldExpression = newFieldExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.CONDITION__FIELD_EXPRESSION, oldFieldExpression, newFieldExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldExpression(FieldExpression newFieldExpression) {
		if (newFieldExpression != fieldExpression) {
			NotificationChain msgs = null;
			if (fieldExpression != null)
				msgs = ((InternalEObject)fieldExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterSearchPackage.CONDITION__FIELD_EXPRESSION, null, msgs);
			if (newFieldExpression != null)
				msgs = ((InternalEObject)newFieldExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterSearchPackage.CONDITION__FIELD_EXPRESSION, null, msgs);
			msgs = basicSetFieldExpression(newFieldExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.CONDITION__FIELD_EXPRESSION, newFieldExpression, newFieldExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterSearchPackage.CONDITION__FIELD_EXPRESSION:
				return basicSetFieldExpression(null, msgs);
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
			case TwitterSearchPackage.CONDITION__FIELD_EXPRESSION:
				return getFieldExpression();
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
			case TwitterSearchPackage.CONDITION__FIELD_EXPRESSION:
				setFieldExpression((FieldExpression)newValue);
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
			case TwitterSearchPackage.CONDITION__FIELD_EXPRESSION:
				setFieldExpression((FieldExpression)null);
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
			case TwitterSearchPackage.CONDITION__FIELD_EXPRESSION:
				return fieldExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
