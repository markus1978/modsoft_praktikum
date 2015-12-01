package de.hub.modsoft.twittersearch.data;

public class Location {

	private final double longitude;
	private final double latitude;
	private final double radius;
	public Location(double longitude, double latitude, double radius) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.radius = radius;
	}
	public double getLongitude() {
		return longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getRadius() {
		return radius;
	}

	public String toString() {		
		return "("+longitude+","+latitude+","+radius+"mi)";
	}
}
