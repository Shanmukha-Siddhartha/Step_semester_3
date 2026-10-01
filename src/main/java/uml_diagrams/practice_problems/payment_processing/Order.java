package practice_problems.payment_processing;

public class Order {

    private Customer customer;
    private double amount;
    private boolean paid;

    public Order(
            Customer customer,
            double amount) {

        this.customer = customer;
        this.amount = amount;
        this.paid = false;
    }

    public void makePayment(
            PaymentMethod method) {

        if (paid) {

            System.out.println(
                    "Payment already completed."
            );

            return;
        }

        double finalAmount =
                method.processPayment(amount);

        paid = true;

        System.out.printf(
                "%s paid using %s. Final amount: ₹%.2f%n",
                customer.getName(),
                method.getMethodName(),
                finalAmount
        );
    }

    public boolean isPaid() {
        return paid;
    }
}