package practice_problems.payment_processing;

public class WalletPayment
        implements PaymentMethod {

    @Override
    public double processPayment(
            double amount) {

        return amount - 50;
    }

    @Override
    public String getMethodName() {
        return "Wallet";
    }
}