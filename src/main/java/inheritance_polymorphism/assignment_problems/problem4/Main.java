package inheritance_polymorphism.assignment_problems.problem4;

public class Main {
    public static void main(String[] args) {
        GymMember standard =
                new GymMember("MEM6", 1000);

        PremiumMember premium =
                new PremiumMember("MEM7", 2000, "Coach Riya");

        System.out.println(
                GymMember.batchPrint(
                        new GymMember[]{standard, premium}
                )
        );
    }
}