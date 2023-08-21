/**
 This is the View file.
 It holds the "toString" methods for what the user sees.
 */
public class View {

    /**
     Prints the vehicle details.
     @param gas is a double that represents gallons in the vehicle.
     @param mpg is an integer that represents miles per gallon for the vehicle.
     @param speed is an integer that represents miles per hour for the vehicle.
     @return nothing.
     */
    public void printVehicleDetails(double gas, int mpg, int speed) {
        System.out.println("Gas: " + gas);
        System.out.println("MPG: " + mpg);
        System.out.println("Speed: " + speed);
    }

    /**
     Prints the point details.
     @param latitude is a double that represents the point's latitude.
     @param longitude is a double that represents miles the point's longitude.
     @return nothing.
     */
    public void printPointDetails(double latitude, double longitude) {
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }

    /**
     Prints the distance between the current point and a given point.
     @param distance is a double that represents the distance between two points.
     @return nothing.
     */
    public void printDistance(double distance) {
        System.out.printf(("Distance: " + "%.2f" + " miles.\n"), distance);
    }

    /**
     Prints the time it will take to arrive at a given point.
     @param time is the amount of time needed to arrive at a given point.
     @return nothing.
     */
    public void printTravelTime(double time) {
        System.out.printf(("Estimated Travel Time: " + "%.2f" + " hours to arrival.\n"), time);
    }

    /**
     Prints the time until the vehicle runs out of gas.
     @param time is the amount of time until the vehicle runs out of gas.
     @return nothing.
     */
    public void printTimeUntilRefill(int time) {
        System.out.println(("Estimated Time until Refill: " + time + " hours."));
    }

    /**
     Prints the time needed to stop a vehicle in a certain distance.
     @param time needed to stop a vehicle.
     @return nothing.
     */
    public void printTimeToStop(double time) {
        System.out.printf(("Estimated Time to Stop: " + "%.2f" + " seconds.\n"), time);
    }

}
