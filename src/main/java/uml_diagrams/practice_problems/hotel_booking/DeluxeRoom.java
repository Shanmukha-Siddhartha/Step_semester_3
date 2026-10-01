package practice_problems.hotel_booking;

public class DeluxeRoom extends Room {

    public DeluxeRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double getDailyPrice() {
        return 180;
    }
}