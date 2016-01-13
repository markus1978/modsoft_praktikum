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
 *   <li>{@link de.hub.modsoft.twittersearch.model.Search#getSortation <em>Sortation</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Search#getOptions <em>Options</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Search#getSearchFor <em>Search For</em>}</li>
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
	 * Returns the value of the '<em><b>Sortation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortation</em>' containment reference.
	 * @see #setSortation(FieldExpr)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getSearch_Sortation()
	 * @model containment="true"
	 * @generated
	 */
	FieldExpr getSortation();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Search#getSortation <em>Sortation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortation</em>' containment reference.
	 * @see #getSortation()
	 * @generated
	 */
	void setSortation(FieldExpr value);

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
	 * Returns the value of the '<em><b>Search For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search For</em>' reference.
	 * @see #setSearchFor(TwitterObjectType)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getSearch_SearchFor()
	 * @model extendedMetaData="name='fields'"
	 * @generated
	 */
	TwitterObjectType getSearchFor();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Search#getSearchFor <em>Search For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search For</em>' reference.
	 * @see #getSearchFor()
	 * @generated
	 */
	void setSearchFor(TwitterObjectType value);

} // Search
