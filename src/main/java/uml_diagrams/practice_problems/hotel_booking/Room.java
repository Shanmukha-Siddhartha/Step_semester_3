package practice_problems.hotel_booking;

public abstract class Room {

    private String roomNumber;

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public abstract double getDailyPrice();
}