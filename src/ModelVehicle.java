/**
 This is the Model file for a vehicle.
 It holds the main methods used by a vehicle.
 */
public class ModelVehicle {

    // There is no constructor for this class since we're only using one car.
    private double gas;
    private int mpg;
    private int speed;

    /**
     Getter method for gas attribute.
     @return gas (double) in gallons.
     */
    public double getGas() {
        return gas;
    }

    /**
     Getter method for mpg attribute.
     @return mpg (integer).
     */
    public int getMpg() {
        return mpg;
    }

    /**
     Getter method for speed attribute.
     @return speed (integer).
     */
    public int getSpeed() {
        return speed;
    }

    /**
     Setter method for gas attribute.
     @param gas (double) in gallons.
     @return nothing.
     */
    public void setGas(double gas) {
        this.gas = gas;
    }

    /**
     Setter method for mpg attribute.
     @param mpg (integer).
     @return nothing.
     */
    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    /**
     Setter method for speed attribute.
     @param speed (integer).
     @return nothing.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     Calculates the time to travel the given distance.
     @param distance (double).
     @return time to travel given distance (double).
     */
    public double calculateTravelTime(double distance) {return(distance/this.speed);}

    /**
     Calculates the time until gas is empty.
     @return time until gas is empty (integer).
     */
    public int calculateTimeUntilRefill() {
        int milesLeft = (int)(this.mpg * this.gas); // Type cast this into an integer to round down (we don't want to overestimate our time until refuel!).
        return milesLeft / this.speed;
    }

    /**
     Calculates the time needed to stop in a certain distance.
     @param stoppingDistance (double)
     @return time needed to stop (double).
     */
    public double calculateTimeToStop(double stoppingDistance) {
        stoppingDistance = stoppingDistance*5280; // Converts miles to feet.
        double feetPerSecond = this.speed*1.46667; // Converts mph to fps (feet per second).
        return(stoppingDistance/(feetPerSecond/2)); // I used the formula (Distance / Average Velocity = Time)
    }

}
