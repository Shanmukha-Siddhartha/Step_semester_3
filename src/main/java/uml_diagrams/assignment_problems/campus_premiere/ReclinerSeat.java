package campus_premiere;

public class ReclinerSeat extends Seat {

    public ReclinerSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public double getPrice() {
        return 400;
    }
}