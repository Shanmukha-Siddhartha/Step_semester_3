package inheritance_polymorphism.assignment_problems.problem5;

public class Main {
    public static void main(String[] args) {
        GymMember m1 = new GymMember(1000);

        System.out.println(m1.getMembershipNumber());
        System.out.println(GymMember.getMembersEnrolled());

        System.out.println(
                GymMember.isValidReferralCode("G45B")
        );

        System.out.println(
                GymMember.isValidReferralCode("G4B")
        );

        System.out.println(
                GymMember.isValidReferralCode("X45B")
        );

        m1.payFee(500);
        m1.payFee(500, "UPI");

        System.out.println(m1.getFeesPaid());

        GroupClassMember group =
                new GroupClassMember(1500, "Zumba");

        GymMember individual =
                new GymMember(1000);

        System.out.println(
                GymMember.processWeeklyCheckIn(
                        new GymMember[]{group, null, individual}
                )
        );
    }
}