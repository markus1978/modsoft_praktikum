/**
 */
package de.hub.modsoft.twittersearch.model.impl;

import de.hub.modsoft.twittersearch.model.DistanceUnit;
import de.hub.modsoft.twittersearch.model.Location;
import de.hub.modsoft.twittersearch.model.TwitterSearchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.LocationImpl#getLon <em>Lon</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.LocationImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.LocationImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.hub.modsoft.twittersearch.model.impl.LocationImpl#getRadiusUnit <em>Radius Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends SearchOptionImpl implements Location {
	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final double LON_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected double lon = LON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final double LAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected double lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadiusUnit() <em>Radius Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusUnit()
	 * @generated
	 * @ordered
	 */
	protected static final DistanceUnit RADIUS_UNIT_EDEFAULT = DistanceUnit.MI;

	/**
	 * The cached value of the '{@link #getRadiusUnit() <em>Radius Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiusUnit()
	 * @generated
	 * @ordered
	 */
	protected DistanceUnit radiusUnit = RADIUS_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterSearchPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(double newLon) {
		double oldLon = lon;
		lon = newLon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.LOCATION__LON, oldLon, lon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(double newLat) {
		double oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.LOCATION__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.LOCATION__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceUnit getRadiusUnit() {
		return radiusUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadiusUnit(DistanceUnit newRadiusUnit) {
		DistanceUnit oldRadiusUnit = radiusUnit;
		radiusUnit = newRadiusUnit == null ? RADIUS_UNIT_EDEFAULT : newRadiusUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterSearchPackage.LOCATION__RADIUS_UNIT, oldRadiusUnit, radiusUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterSearchPackage.LOCATION__LON:
				return getLon();
			case TwitterSearchPackage.LOCATION__LAT:
				return getLat();
			case TwitterSearchPackage.LOCATION__RADIUS:
				return getRadius();
			case TwitterSearchPackage.LOCATION__RADIUS_UNIT:
				return getRadiusUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterSearchPackage.LOCATION__LON:
				setLon((Double)newValue);
				return;
			case TwitterSearchPackage.LOCATION__LAT:
				setLat((Double)newValue);
				return;
			case TwitterSearchPackage.LOCATION__RADIUS:
				setRadius((Double)newValue);
				return;
			case TwitterSearchPackage.LOCATION__RADIUS_UNIT:
				setRadiusUnit((DistanceUnit)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TwitterSearchPackage.LOCATION__LON:
				setLon(LON_EDEFAULT);
				return;
			case TwitterSearchPackage.LOCATION__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case TwitterSearchPackage.LOCATION__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case TwitterSearchPackage.LOCATION__RADIUS_UNIT:
				setRadiusUnit(RADIUS_UNIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TwitterSearchPackage.LOCATION__LON:
				return lon != LON_EDEFAULT;
			case TwitterSearchPackage.LOCATION__LAT:
				return lat != LAT_EDEFAULT;
			case TwitterSearchPackage.LOCATION__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case TwitterSearchPackage.LOCATION__RADIUS_UNIT:
				return radiusUnit != RADIUS_UNIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lon: ");
		result.append(lon);
		result.append(", lat: ");
		result.append(lat);
		result.append(", radius: ");
		result.append(radius);
		result.append(", radiusUnit: ");
		result.append(radiusUnit);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
