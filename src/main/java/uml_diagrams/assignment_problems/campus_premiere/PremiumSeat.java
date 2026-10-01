package campus_premiere.problem3;

public class PremiumSeat extends Seat {

    public PremiumSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public double getPrice() {
        return 250;
    }
}