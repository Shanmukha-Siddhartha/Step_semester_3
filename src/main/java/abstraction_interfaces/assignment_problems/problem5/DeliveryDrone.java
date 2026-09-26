package abstraction_interfaces.assignment_problems.problem5;

public class DeliveryDrone extends Drone implements Trackable {

    private String location;

    public DeliveryDrone(String location) {
        this.location = location;
    }

    @Override
    public String fly() {
        return "Delivery drone flying";
    }

    @Override
    public String getLocation() {
        return location;
    }
}