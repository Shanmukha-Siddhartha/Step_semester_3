package campus_premiere.problem3;

public class RegularSeat extends Seat {

    public RegularSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public double getPrice() {
        return 150;
    }
}