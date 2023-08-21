/**
 This is the Driver file.
 Here I demonstrate how the program works.
 */
public class Driver {

    // Creates a "GPS" like object, where the default coordinates are set to (0.0,0.0).
    private static ModelPoint fetchPointData() {
        ModelPoint modelPoint = new ModelPoint();
        return modelPoint;
    }

    // Creates a vehicle object, where the user indicates they have 15 gallons of gas, get 20 miles to the gallon, and are currently moving at 0 miles per hour.
    // We start at 0 miles per hours since the car is off.
    private static ModelVehicle fetchVehicleData() {
        ModelVehicle modelVehicle = new ModelVehicle();
        modelVehicle.setGas(15);
        modelVehicle.setMpg(20);
        modelVehicle.setSpeed(0);
        return modelVehicle;
    }

    public static void main(String[] args) {

        // Retrieves the default information for the GPS and vehicle and displays it to the user.
        ModelPoint modelPoint = fetchPointData();
        ModelVehicle modelVehicle = fetchVehicleData();

        // Creates a new view and controller to update and display information.
        View view = new View();
        Controller controller = new Controller(modelPoint, modelVehicle, view);

        // GPS is turned on and receives current coordinates and displays them to the user.
        controller.setLatitude(43.64752813892727);
        controller.setLongitude(-70.26157928911995);
        controller.updatePointView();
        controller.updateVehicleView();

        // Vehicle is turned on and reaches a cruising speed of 60 miles per hour.
        controller.setSpeed(60);

        // User inputs destination coordinates to see the distance and estimates time to arrival.
        controller.showDistance(new ModelPoint(43.49433019421346, -70.45887384051758));
        controller.showTimeToDestination(new ModelPoint(43.49433019421346, -70.45887384051758));

        // User can also view time until a refuel is needed and time needed to stop 0.1 miles.
        controller.showTimeUntilRefill();
        controller.showTimeToStop(0.1);

        // User arrives at their destination and gas and coordinates are updated.
        controller.setLatitude(43.49433019421346);
        controller.setLongitude(-70.45887384051758);
        controller.setGas(14);
        controller.setMpg(20);
        controller.setSpeed(0);

        // New information is displayed to the user.
        controller.updatePointView();
        controller.updateVehicleView();
    }
}