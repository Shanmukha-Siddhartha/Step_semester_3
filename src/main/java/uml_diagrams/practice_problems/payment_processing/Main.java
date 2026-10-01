package practice_problems.payment_processing;

public class Main {

    public static void main(String[] args) {

        Customer john =
                new Customer("John");

        Customer jane =
                new Customer("Jane");

        Order order1 =
                new Order(john, 1000);

        Order order2 =
                new Order(jane, 1500);

        order1.makePayment(
                new CreditCardPayment()
        );

        order2.makePayment(
                new UPIPayment()
        );

        Order order3 =
                new Order(
                        new Customer("Alex"),
                        2000
                );

        order3.makePayment(
                new WalletPayment()
        );

        order1.makePayment(
                new UPIPayment()
        );
    }
}