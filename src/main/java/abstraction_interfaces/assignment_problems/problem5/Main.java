package abstraction_interfaces.assignment_problems.problem5;

public class Main {

    public static void main(String[] args) {

        DeliveryDrone deliveryDrone =
                new DeliveryDrone("Chennai");

        ScoutDrone scoutDrone =
                new ScoutDrone();

        GroundRobot groundRobot =
                new GroundRobot("Bangalore");

        System.out.println(deliveryDrone.fly());
        System.out.println(scoutDrone.fly());

        System.out.println(
                FleetManager.getLocationIfTrackable(deliveryDrone)
        );

        System.out.println(
                FleetManager.getLocationIfTrackable(scoutDrone)
        );

        System.out.println(
                FleetManager.getLocationIfTrackable(groundRobot)
        );
    }
}