/**
 */
package de.hub.modsoft.twittersearch;

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
 *   <li>{@link de.hub.modsoft.twittersearch.Condition#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hub.modsoft.twittersearch.Fields}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.Fields
	 * @see #setField(Fields)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getCondition_Field()
	 * @model
	 * @generated
	 */
	Fields getField();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.Condition#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.Fields
	 * @see #getField()
	 * @generated
	 */
	void setField(Fields value);

} // Condition
