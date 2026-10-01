package campus_premiere;

public abstract class Seat {

    private String seatNumber;
    private boolean booked;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.booked = false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return booked;
    }

    public void book() {
        booked = true;
    }

    public void release() {
        booked = false;
    }

    public abstract double getPrice();
}