package campus_premiere.problem3;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    private Customer customer;
    private Show show;
    private List<Seat> seats;
    private boolean cancelled;

    public Booking(Customer customer, Show show) {
        this.customer = customer;
        this.show = show;
        this.seats = new ArrayList<>();
        this.cancelled = false;
    }

    public boolean addSeat(String seatNumber) {

        if (seats.size() >= 6) {
            return false;
        }

        Seat seat = show.getSeat(seatNumber);

        if (seat == null || seat.isBooked()) {
            return false;
        }

        seat.book();
        seats.add(seat);

        return true;
    }

    public double getTotal() {

        double total = 0;

        for (Seat seat : seats) {
            total += seat.getPrice();
        }

        return total;
    }

    public boolean cancel() {

        if (show.isStarted() || cancelled) {
            return false;
        }

        for (Seat seat : seats) {
            seat.release();
        }

        cancelled = true;
        return true;
    }

    public String getCustomerName() {
        return customer.getName();
    }
}