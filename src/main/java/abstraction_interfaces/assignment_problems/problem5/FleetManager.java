package abstraction_interfaces.assignment_problems.problem5;

public class FleetManager {

    public static String getLocationIfTrackable(Object object) {

        if (object instanceof Trackable) {
            Trackable trackable = (Trackable) object;
            return trackable.getLocation();
        }

        return "Not trackable";
    }
}