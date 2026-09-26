package abstraction_interfaces.practice_problems.problem5;

public class DeliveryDesk {

    public static String confirmDelivery(DeliveryNote note) {
        return note.createNote() + " | Confirmed";
    }

    public static String confirmDelivery(DeliveryNote note, String receiver) {
        return note.createNote()
                + " | Received by: "
                + receiver;
    }
}