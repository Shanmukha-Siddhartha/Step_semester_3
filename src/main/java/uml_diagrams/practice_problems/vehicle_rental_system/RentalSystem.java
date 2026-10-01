package practice_problems.vehicle_rental_system;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {

    private List<Vehicle> vehicles;

    public RentalSystem() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Rental rentVehicle(
            Customer customer,
            String vehicleId,
            int days) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVehicleId().equals(vehicleId)) {

                if (vehicle.isRented()) {
                    System.out.println(
                            "Vehicle " + vehicleId
                                    + " is already rented."
                    );
                    return null;
                }

                vehicle.rent();

                Rental rental =
                        new Rental(
                                customer,
                                vehicle,
                                days
                        );

                System.out.printf(
                        "%s rented %s for %d days. Charge: $%.2f%n",
                        customer.getName(),
                        vehicleId,
                        days,
                        rental.getTotalCharge()
                );

                return rental;
            }
        }

        System.out.println(
                "Vehicle " + vehicleId + " not found."
        );

        return null;
    }
}