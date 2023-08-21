import java.lang.Math;

/**
 This is the Model file for a point.
 It holds the main methods used by a point.
 */
public class ModelPoint {
    private double latitude;
    private double longitude;

    // // I used a parameterized constructor to represent a hypothetical given point for the GPS.
    public ModelPoint(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // I used a default constructor to represent the default location as (0.0, 0.0).
    public ModelPoint() {
        this.latitude = 0;
        this.longitude = 0;
    }

    /**
     Getter method for latitude attribute.
     @return latitude (double).
     */
    public double getLatitude() {return latitude;}

    /**
     Getter method for longitude attribute.
     @return longitude (double).

     */
    public double getLongitude() {return longitude;}

    /**
     Setter method for latitude attribute.
     @param latitude (double).
     @return nothing.
     */
    public void setLatitude(double latitude) {this.latitude = latitude;}

    /**
     Setter method for longitude attribute.
     @param longitude (double).
     @return nothing.
     */
    public void setLongitude(double longitude) {this.longitude = longitude;}

    /**
     Calculates the distance between two points
     @param latOne (double)
     @param longOne (double)
     @param latTwo (double)
     @param longTwo (double)
     @return distance between two points (double) in miles.
     */
    public double getDistance(double latOne, double longOne, double latTwo, double longTwo) {

        // Converts the coordinate degrees to radians.
        latOne = Math.toRadians(latOne);
        longOne = Math.toRadians(longOne);
        latTwo = Math.toRadians(latTwo);
        longTwo = Math.toRadians(longTwo);

        // Finds the delta (difference) for latitude and longitude pairs.
        double deltaLat = latTwo - latOne;
        double deltaLong = longTwo - longOne;

        // Haversine to calculate distance between two coordinates.
        double a = Math.pow(Math.sin(deltaLat / 2), 2) + Math.cos(latOne) * Math.cos(latTwo) * Math.pow(Math.sin(deltaLong / 2), 2);
        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of the Earth.
        double r = 6371;

        // Calculates final result and converts it from kilometers to miles.
        return((c * r) *  0.62137);
    }
}
