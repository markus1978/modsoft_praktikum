/**
 */
package de.hub.modsoft.twittersearch.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.IntCondition#getOperand <em>Operand</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.IntCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getIntCondition()
 * @model
 * @generated
 */
public interface IntCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' attribute.
	 * @see #setOperand(int)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getIntCondition_Operand()
	 * @model
	 * @generated
	 */
	int getOperand();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.IntCondition#getOperand <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' attribute.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(int value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hub.modsoft.twittersearch.model.IntOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.model.IntOperators
	 * @see #setOperator(IntOperators)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getIntCondition_Operator()
	 * @model
	 * @generated
	 */
	IntOperators getOperator();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.IntCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.model.IntOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IntOperators value);

} // IntCondition
