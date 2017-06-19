/**
 */
package de.hub.modsoft.twittersearch.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Search#getConditions <em>Conditions</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Search#getOptions <em>Options</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Search#getSearchType <em>Search Type</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.model.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getSearch_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.model.SearchOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getSearch_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<SearchOption> getOptions();

	/**
	 * Returns the value of the '<em><b>Search Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Type</em>' reference.
	 * @see #setSearchType(TwitterObjectTypeDeclaration)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getSearch_SearchType()
	 * @model extendedMetaData="name='fields'"
	 * @generated
	 */
	TwitterObjectTypeDeclaration getSearchType();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Search#getSearchType <em>Search Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Type</em>' reference.
	 * @see #getSearchType()
	 * @generated
	 */
	void setSearchType(TwitterObjectTypeDeclaration value);

} // Search
