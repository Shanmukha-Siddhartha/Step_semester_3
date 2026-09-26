package abstraction_interfaces.practice_problems.problem5;

public class ParcelNote extends DeliveryNote {

    public ParcelNote(String recipient) {
        super(recipient);
    }

    @Override
    public String createNote() {
        return "Parcel delivery for " + recipient;
    }
}