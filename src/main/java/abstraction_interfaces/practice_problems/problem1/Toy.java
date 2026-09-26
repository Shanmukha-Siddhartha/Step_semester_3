package abstraction_interfaces.practice_problems.problem1;

public abstract class Toy {

    protected String name;

    public Toy(String name) {
        this.name = name;
    }

    public abstract String play();
}