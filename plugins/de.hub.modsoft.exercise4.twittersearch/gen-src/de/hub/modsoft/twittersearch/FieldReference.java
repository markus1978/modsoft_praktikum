/**
 */
package de.hub.modsoft.twittersearch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.FieldReference#getFieldDeclaration <em>Field Declaration</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getFieldReference()
 * @model
 * @generated
 */
public interface FieldReference extends FieldExpression {
	/**
	 * Returns the value of the '<em><b>Field Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Declaration</em>' reference.
	 * @see #setFieldDeclaration(TwitterFieldDeclaration)
	 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getFieldReference_FieldDeclaration()
	 * @model
	 * @generated
	 */
	TwitterFieldDeclaration getFieldDeclaration();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.FieldReference#getFieldDeclaration <em>Field Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Declaration</em>' reference.
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	void setFieldDeclaration(TwitterFieldDeclaration value);

} // FieldReference
