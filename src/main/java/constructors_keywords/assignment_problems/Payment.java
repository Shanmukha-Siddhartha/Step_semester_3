package constructors_keywords.assignment_problems;

public class Payment {

    void pay(double amount) {
        System.out.println("Amount paid: " + amount);
    }

    static void processTransaction(Payment payment, double amount) {

        if (payment instanceof CardPayment) {
            CardPayment cardPayment = (CardPayment) payment;
            cardPayment.payWithProcessingFee(amount);
        } else {
            payment.pay(amount);
        }
    }

    public static void main(String[] args) {

        Payment[] payments = {
                new CardPayment(),
                new Payment(),
                new CardPayment(),
                new Payment(),
                new CardPayment()
        };

        double[] amounts = {
                100,
                50,
                200,
                75,
                120
        };

        double totalCollected = 0;

        for (int i = 0; i < payments.length; i++) {

            processTransaction(payments[i], amounts[i]);

            if (payments[i] instanceof CardPayment) {
                totalCollected += amounts[i] * 1.02;
            } else {
                totalCollected += amounts[i];
            }
        }

        System.out.println("Total collected: " + totalCollected);
    }
}

class CardPayment extends Payment {

    void payWithProcessingFee(double amount) {
        double total = amount * 1.02;

        System.out.println(
                "Amount paid with 2% processing fee: " + total
        );
    }
}