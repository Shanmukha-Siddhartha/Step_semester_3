package uml_diagrams.assignment_problems.hostel_laundry_queue;

public class WashCycle {

    private Student student;
    private WashingMachine machine;
    private WashType washType;

    public WashCycle(
            Student student,
            WashingMachine machine,
            WashType washType) {

        this.student = student;
        this.machine = machine;
        this.washType = washType;
    }

    public Student getStudent() {
        return student;
    }

    public WashType getWashType() {
        return washType;
    }

    public double getCharge() {
        return washType.getCharge();
    }

    public int getDuration() {
        return washType.getDuration();
    }
}