package constructors_keywords.assignment_problems;

public class ParkingTicket {
    String vehicleNo;
    double ratePerMinute;

    ParkingTicket(String vehicleNo, double ratePerMinute) {
        this.vehicleNo = vehicleNo;
        this.ratePerMinute = ratePerMinute;
    }

    final double calculateFine(int overstayMinutes) {
        return overstayMinutes * ratePerMinute;
    }

    final void printReceipt(int overstayMinutes) {
        System.out.println(
                vehicleNo + " - Fine: " + calculateFine(overstayMinutes)
        );
    }

    public static void main(String[] args) {
        String[] vehicleNumbers = {
                "TN09AB1234",
                "TN22CD5678",
                "TN09EF9012",
                "TN10GH3456"
        };

        double[] rates = {10, 8, 12, 8};
        int[] overstay = {3, 0, 0, 2};

        ParkingTicket[] tickets =
                new ParkingTicket[vehicleNumbers.length];

        for (int i = 0; i < vehicleNumbers.length; i++) {
            tickets[i] =
                    new ParkingTicket(vehicleNumbers[i], rates[i]);

            if (overstay[i] > 0) {
                tickets[i].printReceipt(overstay[i]);
            } else {
                System.out.println(
                        vehicleNumbers[i] +
                                " - No fine, within allotted time"
                );
            }
        }
    }
}