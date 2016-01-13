/**
 */
package de.hub.modsoft.twittersearch.model;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Time#getBefore <em>Before</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Time#getAfter <em>After</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends SearchOption {
	/**
	 * Returns the value of the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' attribute.
	 * @see #setBefore(Date)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTime_Before()
	 * @model
	 * @generated
	 */
	Date getBefore();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Time#getBefore <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' attribute.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(Date value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' attribute.
	 * @see #setAfter(Date)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getTime_After()
	 * @model
	 * @generated
	 */
	Date getAfter();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Time#getAfter <em>After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' attribute.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(Date value);

} // Time
