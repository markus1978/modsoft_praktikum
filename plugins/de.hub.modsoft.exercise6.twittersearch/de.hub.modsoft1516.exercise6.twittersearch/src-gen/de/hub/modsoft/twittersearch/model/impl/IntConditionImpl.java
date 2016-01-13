/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.IntCondition;
import de.hub.modsoft.twittersearch.model.IntOperators;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.IntConditionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.IntConditionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntConditionImpl extends ConditionImpl implements IntCondition {
	/**
	 * The default value of the '{@link #getOperand() <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERAND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected int operand = OPERAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final IntOperators OPERATOR_EDEFAULT = IntOperators.GT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected IntOperators operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.INT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(int newOperand) {
		int oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.INT_CONDITION__OPERAND, oldOperand, operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntOperators getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(IntOperators newOperator) {
		IntOperators oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.INT_CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterSearchPackage.INT_CONDITION__OPERAND:
				return getOperand();
			case TwitterSearchPackage.INT_CONDITION__OPERATOR:
				return getOperator();
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
			case TwitterSearchPackage.INT_CONDITION__OPERAND:
				setOperand((Integer)newValue);
				return;
			case TwitterSearchPackage.INT_CONDITION__OPERATOR:
				setOperator((IntOperators)newValue);
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
			case TwitterSearchPackage.INT_CONDITION__OPERAND:
				setOperand(OPERAND_EDEFAULT);
				return;
			case TwitterSearchPackage.INT_CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case TwitterSearchPackage.INT_CONDITION__OPERAND:
				return operand != OPERAND_EDEFAULT;
			case TwitterSearchPackage.INT_CONDITION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (operand: ");
		result.append(operand);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //IntConditionImpl
