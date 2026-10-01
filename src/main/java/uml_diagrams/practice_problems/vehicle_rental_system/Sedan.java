package practice_problems.vehicle_rental_system;

public class Sedan extends Vehicle {

    public Sedan(String vehicleId) {
        super(vehicleId);
    }

    @Override
    public double calculateCharge(int days) {
        return days * 50;
    }
}