/**
 */
package de.hub.modsoft.twittersearch.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getObjectType <em>Object Type</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getFieldDeclaration()
 * @model
 * @generated
 */
public interface FieldDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hub.modsoft.twittersearch.model.FieldTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Type</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.model.FieldTypes
	 * @see #setFieldType(FieldTypes)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getFieldDeclaration_FieldType()
	 * @model
	 * @generated
	 */
	FieldTypes getFieldType();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getFieldType <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Type</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.model.FieldTypes
	 * @see #getFieldType()
	 * @generated
	 */
	void setFieldType(FieldTypes value);

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
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getFieldDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.modsoft.twittersearch.model.TwitterObjectType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' container reference.
	 * @see #setObjectType(TwitterObjectType)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getFieldDeclaration_ObjectType()
	 * @see de.hub.modsoft.twittersearch.model.TwitterObjectType#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	TwitterObjectType getObjectType();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.FieldDeclaration#getObjectType <em>Object Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' container reference.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(TwitterObjectType value);

} // FieldDeclaration
