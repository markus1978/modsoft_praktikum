/**
 */
package de.hub.modsoft.twittersearch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.Dot#getLeft <em>Left</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.Dot#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getDot()
 * @model
 * @generated
 */
public interface Dot extends FieldExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(FieldExpression)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getDot_Left()
	 * @model containment="true"
	 * @generated
	 */
	FieldExpression getLeft();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.Dot#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(FieldExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(FieldReference)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getDot_Right()
	 * @model containment="true"
	 * @generated
	 */
	FieldReference getRight();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.Dot#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(FieldReference value);

} // Dot
