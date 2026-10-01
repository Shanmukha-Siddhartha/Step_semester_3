package practice_problems.hotel_booking;

public class Reservation {

    private Customer customer;
    private Room room;
    private int startDay;
    private int endDay;
    private boolean cancelled;

    public Reservation(
            Customer customer,
            Room room,
            int startDay,
            int endDay) {

        this.customer = customer;
        this.room = room;
        this.startDay = startDay;
        this.endDay = endDay;
        this.cancelled = false;
    }

    public boolean overlaps(
            int requestedStart,
            int requestedEnd) {

        if (cancelled) {
            return false;
        }

        return startDay < requestedEnd
                && requestedStart < endDay;
    }

    public boolean canCancel(int currentDay) {

        return !cancelled && currentDay < startDay;
    }

    public void cancel(int currentDay) {

        if (canCancel(currentDay)) {
            cancelled = true;

            System.out.println(
                    "Reservation cancelled."
            );
        } else {
            System.out.println(
                    "Cancellation not allowed."
            );
        }
    }

    public double getTotalPrice() {

        int days = endDay - startDay;

        return days * room.getDailyPrice();
    }

    public Room getRoom() {
        return room;
    }

    public Customer getCustomer() {
        return customer;
    }
}