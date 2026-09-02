package constructors_keywords.assignment_problems;

public class MembershipCard {
    static String libraryName;
    static String validUntil;

    static {
        libraryName = "SRM Central Library";
        validUntil = "May 2027";
        System.out.println("Library info loaded");
    }

    String studentName;

    MembershipCard(String studentName) {
        this.studentName = studentName;
    }

    void printConfirmation() {
        System.out.println(
                studentName +
                        " - Membership card created for " +
                        libraryName +
                        " - Valid until " +
                        validUntil
        );
    }

    public static void main(String[] args) {
        String[] names = {
                "Ravi",
                "Meera",
                "Karthik",
                "Anitha",
                "Arjun"
        };

        MembershipCard[] cards =
                new MembershipCard[names.length];

        for (int i = 0; i < names.length; i++) {
            cards[i] = new MembershipCard(names[i]);
            cards[i].printConfirmation();
        }
    }
}