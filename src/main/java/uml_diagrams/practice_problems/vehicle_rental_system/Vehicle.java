package practice_problems.vehicle_rental_system;

public abstract class Vehicle {

    private String vehicleId;
    private boolean rented;

    public Vehicle(String vehicleId) {
        this.vehicleId = vehicleId;
        this.rented = false;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public boolean isRented() {
        return rented;
    }

    public void rent() {
        rented = true;
    }

    public void returnVehicle() {
        rented = false;
    }

    public abstract double calculateCharge(int days);
}