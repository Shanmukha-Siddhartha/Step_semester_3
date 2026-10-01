package campus_premiere.problem3;

import java.util.HashMap;
import java.util.Map;

public class Show {

    private String showName;
    private boolean started;
    private Map<String, Seat> seats;

    public Show(String showName) {
        this.showName = showName;
        this.started = false;
        this.seats = new HashMap<>();
    }

    public void addSeat(Seat seat) {
        seats.put(seat.getSeatNumber(), seat);
    }

    public Seat getSeat(String seatNumber) {
        return seats.get(seatNumber);
    }

    public boolean isStarted() {
        return started;
    }

    public void startShow() {
        started = true;
    }
}