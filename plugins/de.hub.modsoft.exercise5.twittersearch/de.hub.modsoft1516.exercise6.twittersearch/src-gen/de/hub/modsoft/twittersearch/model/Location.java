/**
 */
package de.hub.modsoft.twittersearch.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Location#getLon <em>Lon</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Location#getLat <em>Lat</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Location#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.Location#getRadiusUnit <em>Radius Unit</em>}</li>
 * </ul>
 *
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends SearchOption {
	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #setLon(double)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getLocation_Lon()
	 * @model
	 * @generated
	 */
	double getLon();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Location#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #getLon()
	 * @generated
	 */
	void setLon(double value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getLocation_Lat()
	 * @model
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Location#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getLocation_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Location#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Radius Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hub.modsoft.twittersearch.model.DistanceUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius Unit</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.model.DistanceUnit
	 * @see #setRadiusUnit(DistanceUnit)
	 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getLocation_RadiusUnit()
	 * @model
	 * @generated
	 */
	DistanceUnit getRadiusUnit();

	/**
	 * Sets the value of the '{@link de.hub.modsoft.twittersearch.model.Location#getRadiusUnit <em>Radius Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius Unit</em>' attribute.
	 * @see de.hub.modsoft.twittersearch.model.DistanceUnit
	 * @see #getRadiusUnit()
	 * @generated
	 */
	void setRadiusUnit(DistanceUnit value);

} // Location
