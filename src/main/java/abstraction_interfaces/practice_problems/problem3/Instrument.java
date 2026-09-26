package abstraction_interfaces.practice_problems.problem3;

public abstract class Instrument {

    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    public abstract String play();
}