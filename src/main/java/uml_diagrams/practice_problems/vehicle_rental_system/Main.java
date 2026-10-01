package practice_problems.vehicle_rental_system;

public class Main {

    public static void main(String[] args) {

        RentalSystem system = new RentalSystem();

        system.addVehicle(new Sedan("S101"));
        system.addVehicle(new SUV("SUV201"));
        system.addVehicle(new Truck("T301"));

        Customer john = new Customer("John");
        Customer jane = new Customer("Jane");

        Rental johnRental =
                system.rentVehicle(
                        john,
                        "S101",
                        3
                );

        system.rentVehicle(
                jane,
                "S101",
                2
        );

        if (johnRental != null) {
            johnRental.completeRental();

            System.out.println(
                    "Vehicle S101 returned and is available."
            );
        }

        Rental janeRental =
                system.rentVehicle(
                        jane,
                        "S101",
                        2
                );
    }
}