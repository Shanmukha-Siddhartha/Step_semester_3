package abstraction_interfaces.assignment_problems.problem1;

public class Main {

    public static void main(String[] args) {

        Ringable[] devices = {
                new AlarmClock(),
                new Doorbell()
        };

        System.out.println(WakeUpCircuit.ringAll(devices));
    }
}