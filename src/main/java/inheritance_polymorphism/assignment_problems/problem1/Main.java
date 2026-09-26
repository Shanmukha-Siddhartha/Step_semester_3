package inheritance_polymorphism.assignment_problems.problem1;

public class Main {
    public static void main(String[] args) {
        PremiumMember p = new PremiumMember("MEM01", 2000, "Coach Riya");

        p.attendSession();
        p.attendSession();

        System.out.println(p.getSessionsAttended());

        System.out.println(
                GymMember.signUpBatch(
                        new String[]{"MEM1", "GM1", "MEM2", " ", "MEM3"},
                        1000
                )
        );
    }
}