package abstraction_interfaces.practice_problems.problem5;

public class Main {

    public static void main(String[] args) {

        DeliveryNote parcel =
                new ParcelNote("Shan");

        DeliveryNote letter =
                new LetterNote("Rahul");

        System.out.println(
                DeliveryDesk.confirmDelivery(parcel)
        );

        System.out.println(
                DeliveryDesk.confirmDelivery(letter, "Rahul")
        );
    }
}