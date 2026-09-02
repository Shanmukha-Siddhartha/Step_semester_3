package object_oriented_programming.assignment_problems;

public class FeeAccount {
    String studentName;
    double balance;

    FeeAccount(String studentName, double balance) {
        this.studentName = studentName;
        this.balance = balance;
    }

    void pay(double amount) {
        balance -= amount;
        System.out.println(studentName + " paid " + amount);
    }

    public static void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            HostelFeeAccount hostel = (HostelFeeAccount) account;
            hostel.payHostelFee(amount);
        } else {
            account.pay(amount);
        }
    }

    public static void main(String[] args) {
        FeeAccount[] accounts = {
                new HostelFeeAccount("Ravi", 100000),
                new FeeAccount("Anitha", 100000),
                new HostelFeeAccount("Karthik", 100000),
                new FeeAccount("Meera", 100000)
        };

        double[] amounts = {
                60000,
                60000,
                60000,
                60000
        };

        int hostelCount = 0;
        int dayScholarCount = 0;

        for (int i = 0; i < accounts.length; i++) {
            processPayment(accounts[i], amounts[i]);

            if (accounts[i] instanceof HostelFeeAccount) {
                hostelCount++;
            } else {
                dayScholarCount++;
            }
        }

        System.out.println("Hostel accounts: " + hostelCount);
        System.out.println("Day scholar accounts: " + dayScholarCount);
    }
}

class HostelFeeAccount extends FeeAccount {

    HostelFeeAccount(String studentName, double balance) {
        super(studentName, balance);
    }

    void payHostelFee(double amount) {
        System.out.println(studentName + " paid hostel fee: " + amount);
        balance -= amount;
    }
}