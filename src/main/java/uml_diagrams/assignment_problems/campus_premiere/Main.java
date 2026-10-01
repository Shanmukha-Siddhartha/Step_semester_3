package campus_premiere.problem3;

public class Main {

    public static void main(String[] args) {

        Show show = new Show("Campus Premiere");

        show.addSeat(new RegularSeat("A1"));
        show.addSeat(new RegularSeat("A2"));
        show.addSeat(new PremiumSeat("F5"));
        show.addSeat(new ReclinerSeat("R1"));

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");
        Customer neha = new Customer("Neha");

        Booking ashaBooking =
                new Booking(asha, show);

        ashaBooking.addSeat("A1");
        ashaBooking.addSeat("A2");
        ashaBooking.addSeat("F5");

        System.out.printf(
                "Asha booking total: ₹%.0f%n",
                ashaBooking.getTotal()
        );

        Booking raviBooking =
                new Booking(ravi, show);

        if (!raviBooking.addSeat("A2")) {
            System.out.println(
                    "Ravi cannot book A2."
            );
        }

        raviBooking.addSeat("R1");

        System.out.printf(
                "Ravi booking total: ₹%.0f%n",
                raviBooking.getTotal()
        );

        ashaBooking.cancel();

        Booking nehaBooking =
                new Booking(neha, show);

        if (nehaBooking.addSeat("A2")) {
            System.out.printf(
                    "Neha booked A2: ₹%.0f%n",
                    nehaBooking.getTotal()
            );
        }
    }
}