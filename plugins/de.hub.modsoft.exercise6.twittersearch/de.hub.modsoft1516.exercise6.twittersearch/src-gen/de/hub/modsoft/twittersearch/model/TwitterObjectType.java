/**
 */
package de.hub.modsoft.twittersearch.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.TwitterObjectType#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.TwitterObjectType#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitterObjectType()
 * @model
 * @generated
 */
public interface TwitterObjectType extends EObject {
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
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitterObjectType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.TwitterObjectType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.model.FieldDeclaration}.
	 * It is bidirectional and its opposite is '{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitterObjectType_Fields()
	 * @see de.hub.modsoft.twittersearch.model.FieldDeclaration#getObjectType
	 * @model opposite="objectType" containment="true"
	 * @generated
	 */
	EList<FieldDeclaration> getFields();

} // TwitterObjectType
