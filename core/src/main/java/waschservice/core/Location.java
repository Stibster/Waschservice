package waschservice.core;

public class Location 
{
    double longitude;
    double latitude;
    
    public Location(double longitude, double latitude)
    {
	this.longitude = longitude;
	this.latitude = latitude;
    }
    
    public static double calculateLocationDistance(Location a, Location b)
    {
	// Haversine-Formel
	final int avgEarthRadius = 6371; // in km
	
	double radLatA = Math.toRadians(a.latitude);
	double radLatB = Math.toRadians(b.latitude);
	double radLatDiff = Math.toRadians(b.latitude - a.latitude);
	double radLongDiff = Math.toRadians(b.longitude - a.longitude);
	
	double zwischenergebnis = Math.sin(radLatDiff / 2) * Math.sin(radLatDiff / 2) *
				    Math.cos(radLatA) * Math.cos(radLatB) *
				    Math.sin(radLongDiff / 2) * Math.sin(radLongDiff / 2);
	double distance = avgEarthRadius * 2 * Math.atan2(Math.sqrt(zwischenergebnis), Math.sqrt(zwischenergebnis));
	
	return distance;
    }
}
