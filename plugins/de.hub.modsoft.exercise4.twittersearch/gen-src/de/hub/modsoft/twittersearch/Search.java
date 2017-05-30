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
 *   <li>{@link de.hub.modsoft.twittersearch.Search#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.Search#getOptions <em>Options</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.Search#getSearchType <em>Search Type</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BooleanExpression)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getSearch_Condition()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpression getCondition();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.Search#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BooleanExpression value);

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
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getSearch_SearchType()
	 * @model
	 * @generated
	 */
	TwitterObjectTypeDeclaration getSearchType();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.Search#getSearchType <em>Search Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Type</em>' reference.
	 * @see #getSearchType()
	 * @generated
	 */
	void setSearchType(TwitterObjectTypeDeclaration value);

} // Search
