/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.StringCondition;
import de.hub.modsoft.twittersearch.model.StringOperators;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.StringConditionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.StringConditionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringConditionImpl extends ConditionImpl implements StringCondition {
	/**
	 * The default value of the '{@link #getOperand() <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected String operand = OPERAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final StringOperators OPERATOR_EDEFAULT = StringOperators.CONTAINS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected StringOperators operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.STRING_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(String newOperand) {
		String oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.STRING_CONDITION__OPERAND, oldOperand, operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOperators getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(StringOperators newOperator) {
		StringOperators oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.STRING_CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterSearchPackage.STRING_CONDITION__OPERAND:
				return getOperand();
			case TwitterSearchPackage.STRING_CONDITION__OPERATOR:
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
			case TwitterSearchPackage.STRING_CONDITION__OPERAND:
				setOperand((String)newValue);
				return;
			case TwitterSearchPackage.STRING_CONDITION__OPERATOR:
				setOperator((StringOperators)newValue);
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
			case TwitterSearchPackage.STRING_CONDITION__OPERAND:
				setOperand(OPERAND_EDEFAULT);
				return;
			case TwitterSearchPackage.STRING_CONDITION__OPERATOR:
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
			case TwitterSearchPackage.STRING_CONDITION__OPERAND:
				return OPERAND_EDEFAULT == null ? operand != null : !OPERAND_EDEFAULT.equals(operand);
			case TwitterSearchPackage.STRING_CONDITION__OPERATOR:
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

} //StringConditionImpl
