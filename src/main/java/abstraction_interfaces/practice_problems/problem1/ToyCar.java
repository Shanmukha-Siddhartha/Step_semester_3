package abstraction_interfaces.practice_problems.problem1;

public class ToyCar extends Toy {

    public ToyCar(String name) {
        super(name);
    }

    @Override
    public String play() {
        return name + " is driving";
    }
}