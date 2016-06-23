/**
 */
package de.hub.modsoft.twittersearch.model;

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
 *   <li>{@link de.hub.modsoft.twittersearch.model.Model#getSearches <em>Searches</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Model#getTwitterTypes <em>Twitter Types</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getModel_Searches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Search> getSearches();

	/**
	 * Returns the value of the '<em><b>Twitter Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.model.TwitterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twitter Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twitter Types</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getModel_TwitterTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TwitterType> getTwitterTypes();

} // Model
