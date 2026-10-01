package practice_problems.hotel_booking;

public class StandardRoom extends Room {

    public StandardRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double getDailyPrice() {
        return 100;
    }
}