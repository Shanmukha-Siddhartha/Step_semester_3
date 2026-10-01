package practice_problems.payment_processing;

public interface PaymentMethod {

    double processPayment(double amount);

    String getMethodName();
}