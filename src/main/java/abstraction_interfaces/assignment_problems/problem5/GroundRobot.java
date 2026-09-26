package abstraction_interfaces.assignment_problems.problem5;

public class GroundRobot implements Trackable {

    private String location;

    public GroundRobot(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }
}