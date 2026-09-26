package inheritance_polymorphism.assignment_problems.problem2;

public class Main {
    public static void main(String[] args) {
        GymMember standard = new GymMember("MEM1", 1000);
        PremiumMember premium =
                new PremiumMember("MEM2", 2000, "Coach Riya");
        EliteMember elite =
                new EliteMember("MEM3", 3000, "Coach Arjun", "L12");
        GroupClassMember group =
                new GroupClassMember("MEM4", 1500, "Zumba");

        standard.displayInfo();
        premium.displayInfo();
        elite.displayInfo();
        group.displayInfo();

        System.out.println(GymMember.classifyGeneration(elite));
        System.out.println(GymMember.classifyGeneration(group));

        premium.attendSession();
        premium.attendSession();
        premium.attendSession();

        elite.attendSession();
        elite.attendSession();

        group.attendSession();
        group.attendSession();
        group.attendSession();
        group.attendSession();

        System.out.println(
                GymMember.getTotalSessionsAttended(
                        new GymMember[]{premium, elite, group}
                )
        );
    }
}