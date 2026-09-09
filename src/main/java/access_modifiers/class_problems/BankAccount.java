package access_modifiers.class_problems;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(10000);

        account.deposit(2000);
        account.withdraw(3000);

        System.out.println(
                "Balance: " + account.getBalance()
        );
    }
}