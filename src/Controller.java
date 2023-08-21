/**
 This is the Controller file.
 It connects the methods in the Models to the View methods.
 */
public class Controller {
    private ModelPoint point;
    private ModelVehicle vehicle;
    private View view;

    // Controller constructor.
    public Controller(ModelPoint point, ModelVehicle vehicle, View view) {
        this.point = point;
        this.vehicle = vehicle;
        this.view = view;
    }

    /**
     Setter method for the point's latitude attribute.
     @param latitude (double).
     @return nothing.
     */
    public void setLatitude(double latitude) {point.setLatitude(latitude);}

    /**
     Setter method for the point's longitude attribute.
     @param longitude (double).
     @return nothing.
     */
    public void setLongitude(double longitude) {
        point.setLongitude(longitude);
    }

    /**
     Setter method for vehicle's gas attribute.
     @param gas (double) in gallons.
     @return nothing.
     */
    public void setGas(double gas) {
        vehicle.setGas(gas);
    }

    /**
     Setter method for vehicle's mpg attribute.
     @param mpg (integer).
     @return nothing.
     */
    public void setMpg(int mpg) {
        vehicle.setMpg(mpg);
    }

    /**
     Setter method for vehicle's speed attribute.
     @param speed (integer).
     @return nothing.
     */
    public void setSpeed(int speed) {
        vehicle.setSpeed(speed);
    }

    /**
     Displays current point attributes using a view method.
     @return nothing.
     */
    public void updatePointView() {
        view.printPointDetails(point.getLatitude(), point.getLongitude());
    }

    /**
     Displays current vehicle attributes using a view method.
     @return nothing.
     */
    public void updateVehicleView() {
        view.printVehicleDetails(vehicle.getGas(), vehicle.getMpg(), vehicle.getSpeed());
    }

    /**
     Displays distance between current point and a given hypothetical point.
     @return nothing.
     */
    public void showDistance(ModelPoint modelPoint) {
        view.printDistance(point.getDistance(point.getLatitude(), point.getLongitude(), modelPoint.getLatitude(), modelPoint.getLongitude()));
    }

    /**
     Displays time to travel distance between current point and a given hypothetical point.
     @return nothing.
     */
    public void showTimeToDestination(ModelPoint modelPoint) {
        double distance = point.getDistance(point.getLatitude(), point.getLongitude(), modelPoint.getLatitude(), modelPoint.getLongitude());
        view.printTravelTime(vehicle.calculateTravelTime(distance));
    }

    /**
     Displays time until gas will be empty (given current speed).
     @return nothing.
     */
    public void showTimeUntilRefill() {
        view.printTimeUntilRefill(vehicle.calculateTimeUntilRefill());
    }

    /**
     Displays time needed to stop (given stopping point distance).
     @return nothing.
     */
    public void showTimeToStop(double stoppingDistance) {
        view.printTimeToStop(vehicle.calculateTimeToStop(stoppingDistance));
    }

}
