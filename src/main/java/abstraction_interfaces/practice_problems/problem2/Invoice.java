package abstraction_interfaces.practice_problems.problem2;

public class Invoice implements Printable {

    private int amount;

    public Invoice(int amount) {
        this.amount = amount;
    }

    @Override
    public String print() {
        return "Invoice Amount: " + amount;
    }
}