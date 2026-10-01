package practice_problems.vehicle_rental_system ;

public class SUV extends Vehicle {

    public SUV(String vehicleId) {
        super(vehicleId);
    }

    @Override
    public double calculateCharge(int days) {
        return days * 80;
    }
}