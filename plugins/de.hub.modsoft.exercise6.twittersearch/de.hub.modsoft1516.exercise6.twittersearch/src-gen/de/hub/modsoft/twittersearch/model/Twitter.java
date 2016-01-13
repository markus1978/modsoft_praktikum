/**
 */
package de.hub.modsoft.twittersearch.model;

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
 *   <li>{@link de.hub.modsoft.twittersearch.model.Twitter#getObjectTypes <em>Object Types</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Twitter#getSearches <em>Searches</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitter()
 * @model
 * @generated
 */
public interface Twitter extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.model.TwitterObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Types</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitter_ObjectTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TwitterObjectType> getObjectTypes();

	/**
	 * Returns the value of the '<em><b>Searches</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.model.Search}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Searches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searches</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTwitter_Searches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Search> getSearches();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<TwitterObject> performSearch(Search search);

} // Twitter
