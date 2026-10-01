package practice_problems.payment_processing;

public class CreditCardPayment
        implements PaymentMethod {

    @Override
    public double processPayment(
            double amount) {

        return amount + (amount * 0.02);
    }

    @Override
    public String getMethodName() {
        return "Credit Card";
    }
}