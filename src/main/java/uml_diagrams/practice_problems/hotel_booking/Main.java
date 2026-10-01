package practice_problems.hotel_booking;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.addRoom(new StandardRoom("101"));
        hotel.addRoom(new DeluxeRoom("201"));
        hotel.addRoom(new SuiteRoom("301"));

        Customer john =
                new Customer("John");

        Customer jane =
                new Customer("Jane");

        Reservation johnReservation =
                hotel.bookRoom(
                        john,
                        "101",
                        1,
                        4
                );

        hotel.bookRoom(
                jane,
                "101",
                2,
                5
        );

        if (johnReservation != null) {
            johnReservation.cancel(0);
        }

        hotel.bookRoom(
                jane,
                "101",
                2,
                5
        );
    }
}