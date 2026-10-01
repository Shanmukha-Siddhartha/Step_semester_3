package practice_problems.hotel_booking;

public class SuiteRoom extends Room {

    public SuiteRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double getDailyPrice() {
        return 300;
    }
}