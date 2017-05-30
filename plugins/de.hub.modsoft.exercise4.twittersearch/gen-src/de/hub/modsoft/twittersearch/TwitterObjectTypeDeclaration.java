/**
 */
package de.hub.modsoft.twittersearch;

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
 *   <li>{@link de.hub.modsoft.twittersearch.TwitterObjectTypeDeclaration#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getTwitterObjectTypeDeclaration()
 * @model
 * @generated
 */
public interface TwitterObjectTypeDeclaration extends Type {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.TwitterFieldDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getTwitterObjectTypeDeclaration_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<TwitterFieldDeclaration> getFields();

} // TwitterObjectTypeDeclaration
