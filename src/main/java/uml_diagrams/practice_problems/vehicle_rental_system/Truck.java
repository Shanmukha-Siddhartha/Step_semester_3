package practice_problems.vehicle_rental_system;

public class Truck extends Vehicle {

    public Truck(String vehicleId) {
        super(vehicleId);
    }

    @Override
    public double calculateCharge(int days) {
        return days * 120;
    }
}