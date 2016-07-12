/**
 */
package de.hub.modsoft.twittersearch.model;

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
 *   <li>{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitterFieldDeclaration()
 * @model
 * @generated
 */
public interface TwitterFieldDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' container reference.
	 * @see #setObjectType(TwitterObjectTypeDeclaration)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitterFieldDeclaration_ObjectType()
	 * @see de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	TwitterObjectTypeDeclaration getObjectType();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getObjectType <em>Object Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' container reference.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(TwitterObjectTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TwitterTypeDeclaration)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitterFieldDeclaration_Type()
	 * @model
	 * @generated
	 */
	TwitterTypeDeclaration getType();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TwitterTypeDeclaration value);

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
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitterFieldDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TwitterFieldDeclaration
