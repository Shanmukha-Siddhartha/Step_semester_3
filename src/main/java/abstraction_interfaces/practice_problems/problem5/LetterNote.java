package abstraction_interfaces.practice_problems.problem5;

public class LetterNote extends DeliveryNote {

    public LetterNote(String recipient) {
        super(recipient);
    }

    @Override
    public String createNote() {
        return "Letter delivery for " + recipient;
    }
}