package abstraction_interfaces.assignment_problems.problem4;

public class Tablet extends ClassroomDevice implements Chargeable {

    @Override
    public String operate() {
        return "Tablet operating";
    }

    @Override
    public String charge() {
        return "Tablet charging";
    }

    @Override
    public String charge(int minutes) {
        return "Tablet charging for " + minutes + " minutes";
    }
}