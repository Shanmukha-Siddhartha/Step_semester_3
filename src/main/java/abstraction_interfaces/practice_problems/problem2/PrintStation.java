package abstraction_interfaces.practice_problems.problem2;

public class PrintStation {

    public static String printAll(Printable[] items) {

        StringBuilder result = new StringBuilder();

        for (Printable item : items) {
            result.append(item.print()).append(" | ");
        }

        return result.toString();
    }
}