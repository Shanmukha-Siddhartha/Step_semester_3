package fitzone_membership;

public class Main {

    public static void main(String[] args) {

        Member asha = new Member("Asha");
        Member ravi = new Member("Ravi");

        Membership ashaMembership =
                new Membership(
                        asha,
                        new QuarterlyPlan()
                );

        Membership raviMembership =
                new Membership(
                        ravi,
                        new MonthlyPlan()
                );

        asha.setMembership(ashaMembership);
        ravi.setMembership(raviMembership);

        System.out.printf(
                "Asha quarterly fee: ₹%.0f%n",
                ashaMembership.getFee()
        );

        System.out.printf(
                "Ravi monthly fee: ₹%.0f%n",
                raviMembership.getFee()
        );

        ashaMembership.checkIn();

        ashaMembership.freeze();

        ashaMembership.checkIn();

        raviMembership.expire();

        raviMembership.freeze();
    }
}