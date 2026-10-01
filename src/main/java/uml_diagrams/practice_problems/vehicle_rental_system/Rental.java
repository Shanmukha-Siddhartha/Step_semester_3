package practice_problems.vehicle_rental_system;

public class Rental {

    private Customer customer;
    private Vehicle vehicle;
    private int days;

    public Rental(
            Customer customer,
            Vehicle vehicle,
            int days) {

        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
    }

    public double getTotalCharge() {
        return vehicle.calculateCharge(days);
    }

    public void completeRental() {
        vehicle.returnVehicle();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public String getVehicleId() {
        return vehicle.getVehicleId();
    }
}