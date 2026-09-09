package access_modifiers.assignment_problems;

public class PremiumMovieTicket {

    private String ticketNumber;
    protected double ticketPrice;
    String movieTitle;

    public PremiumMovieTicket(
            String ticketNumber,
            double ticketPrice,
            String movieTitle) {

        this.ticketNumber = ticketNumber;
        this.ticketPrice = ticketPrice;
        this.movieTitle = movieTitle;
    }

    public void displayTicket() {

        System.out.println(
                "Ticket: " + ticketNumber
        );

        System.out.println(
                "Movie: " + movieTitle
        );

        System.out.println(
                "Price: " + ticketPrice
        );
    }

    public static void main(String[] args) {

        PremiumMovieTicket ticket =
                new PremiumMovieTicket(
                        "MT101",
                        250.0,
                        "Interstellar"
                );

        ticket.displayTicket();

        System.out.println(
                AccessChecker.classifyAccess(
                        "protected",
                        "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"
                )
        );

        System.out.println(
                AccessChecker.classifyAccess(
                        "protected",
                        "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"
                )
        );
    }
}