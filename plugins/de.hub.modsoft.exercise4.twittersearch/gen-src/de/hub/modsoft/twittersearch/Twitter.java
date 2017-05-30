/**
 */
package de.hub.modsoft.twittersearch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.Twitter#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getTwitter()
 * @model
 * @generated
 */
public interface Twitter extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getTwitter_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // Twitter
