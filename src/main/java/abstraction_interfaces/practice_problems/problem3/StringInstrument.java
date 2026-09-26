package abstraction_interfaces.practice_problems.problem3;

public class StringInstrument extends Instrument {

    public StringInstrument(String name) {
        super(name);
    }

    @Override
    public String play() {
        return name + " is playing";
    }
}