/**
 */
package de.hub.modsoft.twittersearch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.Not#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(BooleanExpression)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getNot_Operand()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpression getOperand();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.Not#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(BooleanExpression value);

} // Not
