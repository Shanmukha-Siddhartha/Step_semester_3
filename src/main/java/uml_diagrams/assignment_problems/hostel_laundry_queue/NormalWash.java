package uml_diagrams.assignment_problems.hostel_laundry_queue;

public class NormalWash implements WashType {

    @Override
    public int getDuration() {
        return 45;
    }

    @Override
    public double getCharge() {
        return 30;
    }

    @Override
    public String getName() {
        return "Normal";
    }
}