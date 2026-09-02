package object_oriented_programming.assignment_problems;

public class LateFee {
    String regNo;
    double totalFees;
    int daysLate;

    LateFee(String regNo, double totalFees, int daysLate) {
        this.regNo = regNo;
        this.totalFees = totalFees;
        this.daysLate = daysLate;
    }

    final double calculateLateFee() {
        return totalFees * daysLate / 100;
    }

    final void printSummary() {
        if (daysLate <= 0) {
            return;
        }

        System.out.println(
                regNo + " - Late Fee: " + calculateLateFee()
        );
    }

    public static void main(String[] args) {
        LateFee[] records = {
                new LateFee("REG101", 200000, 10),
                new LateFee("REG102", 220000, 5),
                new LateFee("REG103", 150000, 0)
        };

        for (LateFee record : records) {
            record.printSummary();
        }
    }
}