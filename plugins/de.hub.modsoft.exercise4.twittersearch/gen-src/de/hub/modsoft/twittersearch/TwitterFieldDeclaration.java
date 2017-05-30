/**
 */
package de.hub.modsoft.twittersearch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.TwitterFieldDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.TwitterFieldDeclaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getTwitterFieldDeclaration()
 * @model
 * @generated
 */
public interface TwitterFieldDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getTwitterFieldDeclaration_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.TwitterFieldDeclaration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getTwitterFieldDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.TwitterFieldDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TwitterFieldDeclaration
