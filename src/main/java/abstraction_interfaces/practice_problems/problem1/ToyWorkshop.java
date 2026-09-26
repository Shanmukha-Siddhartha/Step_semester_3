package abstraction_interfaces.practice_problems.problem1;

public class ToyWorkshop {

    public static String playAll(Toy[] toys) {

        StringBuilder result = new StringBuilder();

        for (Toy toy : toys) {
            result.append(toy.play()).append(" | ");
        }

        return result.toString();
    }
}