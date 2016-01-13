/**
 */
package de.hub.modsoft.twittersearch.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.StringCondition#getOperand <em>Operand</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.StringCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getStringCondition()
 * @model
 * @generated
 */
public interface StringCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' attribute.
	 * @see #setOperand(String)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getStringCondition_Operand()
	 * @model
	 * @generated
	 */
	String getOperand();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.StringCondition#getOperand <em>Operand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' attribute.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hub.modsoft.twittersearch.model.StringOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.model.StringOperators
	 * @see #setOperator(StringOperators)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getStringCondition_Operator()
	 * @model
	 * @generated
	 */
	StringOperators getOperator();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.StringCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.model.StringOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(StringOperators value);

} // StringCondition
