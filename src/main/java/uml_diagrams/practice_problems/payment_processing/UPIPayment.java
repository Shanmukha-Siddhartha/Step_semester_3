package practice_problems.payment_processing;

public class UPIPayment
        implements PaymentMethod {

    @Override
    public double processPayment(
            double amount) {

        return amount - (amount * 0.05);
    }

    @Override
    public String getMethodName() {
        return "UPI";
    }
}