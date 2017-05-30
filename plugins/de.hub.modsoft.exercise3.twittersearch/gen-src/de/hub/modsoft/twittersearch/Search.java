/**
 */
package de.hub.modsoft.twittersearch;

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
 *   <li>{@link de.hub.modsoft.twittersearch.Search#getType <em>Type</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.Search#getConditions <em>Conditions</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.Search#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hub.modsoft.twittersearch.TwitterObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.TwitterObjectType
	 * @see #setType(TwitterObjectType)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getSearch_Type()
	 * @model
	 * @generated
	 */
	TwitterObjectType getType();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.Search#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.TwitterObjectType
	 * @see #getType()
	 * @generated
	 */
	void setType(TwitterObjectType value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getSearch_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.modsoft.twittersearch.SearchOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getSearch_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<SearchOption> getOptions();

} // Search
