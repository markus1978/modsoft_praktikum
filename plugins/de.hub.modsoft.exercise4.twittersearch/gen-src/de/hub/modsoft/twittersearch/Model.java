/**
 */
package de.hub.modsoft.twittersearch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.Model#getTwitter <em>Twitter</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.Model#getSearches <em>Searches</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Twitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twitter</em>' containment reference.
	 * @see #setTwitter(Twitter)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getModel_Twitter()
	 * @model containment="true"
	 * @generated
	 */
	Twitter getTwitter();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.Model#getTwitter <em>Twitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Twitter</em>' containment reference.
	 * @see #getTwitter()
	 * @generated
	 */
	void setTwitter(Twitter value);

	/**
	 * Returns the value of the '<em><b>Searches</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.Search}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Searches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searches</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getModel_Searches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Search> getSearches();

} // Model
