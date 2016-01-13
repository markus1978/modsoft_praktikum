/**
 */
package de.hub.modsoft.twittersearch.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.FieldExpr#getFieldDeclaration <em>Field Declaration</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getFieldExpr()
 * @model
 * @generated
 */
public interface FieldExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Declaration</em>' reference.
	 * @see #setFieldDeclaration(FieldDeclaration)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getFieldExpr_FieldDeclaration()
	 * @model extendedMetaData="name='fields'"
	 * @generated
	 */
	FieldDeclaration getFieldDeclaration();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.FieldExpr#getFieldDeclaration <em>Field Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Declaration</em>' reference.
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	void setFieldDeclaration(FieldDeclaration value);

} // FieldExpr
