package abstraction_interfaces.practice_problems.problem3;

public class Violin extends StringInstrument {

    public Violin(String name) {
        super(name);
    }

    @Override
    public String play() {
        return super.play() + " with a bow";
    }
}