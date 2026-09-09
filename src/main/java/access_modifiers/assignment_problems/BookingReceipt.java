package access_modifiers.assignment_problems;

public class BookingReceipt {

    private final String bookingId;
    private final String[] seatNumbers;

    public BookingReceipt(
            String bookingId,
            String[] seatNumbers) {

        this.bookingId = bookingId;
        this.seatNumbers = seatNumbers.clone();
    }

    public String getBookingId() {
        return bookingId;
    }

    public String[] getSeatNumbers() {
        return seatNumbers.clone();
    }

    public BookingReceipt withUpdatedSeat(
            int index,
            String newSeat) {

        String[] updatedSeats =
                seatNumbers.clone();

        if (index >= 0
                && index < updatedSeats.length) {

            updatedSeats[index] = newSeat;
        }

        return new BookingReceipt(
                bookingId,
                updatedSeats
        );
    }

    public static String processNightlySettlement(
            BookingReceipt[] receipts) {

        int processed = 0;
        int nullSkipped = 0;
        int group = 0;
        int individual = 0;

        for (BookingReceipt receipt : receipts) {

            if (receipt == null) {
                nullSkipped++;
                continue;
            }

            processed++;

            if (receipt instanceof GroupBookingReceipt) {
                group++;
            } else {
                individual++;
            }
        }

        return processed + " processed | " +
                nullSkipped + " null skipped | " +
                group + " group | " +
                individual + " individual";
    }

    public static void main(String[] args) {

        BookingReceipt booking =
                new BookingReceipt(
                        "CH-1001",
                        new String[]{"A1", "A2"}
                );

        String[] seats =
                booking.getSeatNumbers();

        seats[0] = "X";

        System.out.println(
                booking.getSeatNumbers()[0]
        );

        BookingReceipt updated =
                booking.withUpdatedSeat(
                        1,
                        "A3"
                );

        System.out.println(
                "Original: " +
                        String.join(
                                ", ",
                                booking.getSeatNumbers()
                        )
        );

        System.out.println(
                "Updated: " +
                        String.join(
                                ", ",
                                updated.getSeatNumbers()
                        )
        );

        BookingReceipt[] receipts = {
                new GroupBookingReceipt(
                        "CH-2002",
                        new String[]{"B1", "B2"},
                        2
                ),
                null,
                new BookingReceipt(
                        "CH-3003",
                        new String[]{"C1"}
                )
        };

        System.out.println(
                processNightlySettlement(receipts)
        );
    }
}