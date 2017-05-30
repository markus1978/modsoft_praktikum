/**
 */
package de.hub.modsoft.twittersearch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.Condition#getFieldExpression <em>Field Expression</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Field Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Expression</em>' containment reference.
	 * @see #setFieldExpression(FieldExpression)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getCondition_FieldExpression()
	 * @model containment="true"
	 * @generated
	 */
	FieldExpression getFieldExpression();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.Condition#getFieldExpression <em>Field Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Expression</em>' containment reference.
	 * @see #getFieldExpression()
	 * @generated
	 */
	void setFieldExpression(FieldExpression value);

} // Condition
