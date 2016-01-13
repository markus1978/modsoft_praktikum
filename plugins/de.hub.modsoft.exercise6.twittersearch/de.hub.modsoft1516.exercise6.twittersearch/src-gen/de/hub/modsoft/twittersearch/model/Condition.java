/**
 */
package de.hub.modsoft.twittersearch.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Condition#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(FieldExpr)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getCondition_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FieldExpr getField();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Condition#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(FieldExpr value);

} // Condition
