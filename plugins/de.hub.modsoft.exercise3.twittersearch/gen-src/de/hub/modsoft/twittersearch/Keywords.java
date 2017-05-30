/**
 */
package de.hub.modsoft.twittersearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keywords</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.Keywords#getKeywords <em>Keywords</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getKeywords()
 * @model
 * @generated
 */
public interface Keywords extends SearchOption {
	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute list.
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getKeywords_Keywords()
	 * @model
	 * @generated
	 */
	EList<String> getKeywords();

} // Keywords
