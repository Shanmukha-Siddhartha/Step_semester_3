package abstraction_interfaces.practice_problems.problem1;

public class ToyRobot extends Toy {

    public ToyRobot(String name) {
        super(name);
    }

    @Override
    public String play() {
        return name + " is walking";
    }
}