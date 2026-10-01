package uml_diagrams.assignment_problems.hostel_laundry_queue;

public class Main {

    public static void main(String[] args) {

        Student asha = new Student("Asha");
        Student ravi = new Student("Ravi");
        Student neha = new Student("Neha");

        WashingMachine m1 =
                new WashingMachine("M1");

        WashingMachine m2 =
                new WashingMachine("M2");

        m1.startWash(asha, new QuickWash());

        if (!m1.startWash(ravi, new HeavyWash())) {
            System.out.println(
                    "Machine M1 is currently busy."
            );
        }

        m2.startWash(ravi, new HeavyWash());

        m1.completeWash();

        m1.startWash(neha, new NormalWash());
    }
}