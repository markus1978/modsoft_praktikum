/**
 */
package de.hub.modsoft.twittersearch.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter Object Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.TwitterObjectTypeDeclaration#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitterObjectTypeDeclaration()
 * @model
 * @generated
 */
public interface TwitterObjectTypeDeclaration extends TwitterType {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration}.
	 * It is bidirectional and its opposite is '{@link de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitterObjectTypeDeclaration_Fields()
	 * @see de.hub.modsoft.twittersearch.model.TwitterFieldDeclaration#getObjectType
	 * @model opposite="objectType" containment="true"
	 * @generated
	 */
	EList<TwitterFieldDeclaration> getFields();

} // TwitterObjectTypeDeclaration
