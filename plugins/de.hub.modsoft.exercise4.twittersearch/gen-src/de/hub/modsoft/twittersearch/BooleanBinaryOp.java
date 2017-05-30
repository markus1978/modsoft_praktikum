/**
 */
package de.hub.modsoft.twittersearch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Binary Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.BooleanBinaryOp#getLeft <em>Left</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.BooleanBinaryOp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getBooleanBinaryOp()
 * @model abstract="true"
 * @generated
 */
public interface BooleanBinaryOp extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BooleanExpression)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getBooleanBinaryOp_Left()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpression getLeft();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.BooleanBinaryOp#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(BooleanExpression)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getBooleanBinaryOp_Right()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpression getRight();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.BooleanBinaryOp#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BooleanExpression value);

} // BooleanBinaryOp
