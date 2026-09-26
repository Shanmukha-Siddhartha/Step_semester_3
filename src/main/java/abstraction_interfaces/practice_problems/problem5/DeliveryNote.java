package abstraction_interfaces.practice_problems.problem5;

public abstract class DeliveryNote {

    protected String recipient;

    public DeliveryNote(String recipient) {
        this.recipient = recipient;
    }

    public abstract String createNote();
}