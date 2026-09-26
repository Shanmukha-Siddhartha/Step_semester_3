package abstraction_interfaces.assignment_problems.problem1;

public class AlarmClock implements Ringable {

    @Override
    public String ring() {
        return "Alarm ringing";
    }
}