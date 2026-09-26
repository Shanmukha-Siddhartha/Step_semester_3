package abstraction_interfaces.assignment_problems.problem1;

public class WakeUpCircuit {

    public static String ringAll(Ringable[] devices) {
        StringBuilder result = new StringBuilder();

        for (Ringable device : devices) {
            result.append(device.ring()).append(" | ");
        }

        return result.toString();
    }
}