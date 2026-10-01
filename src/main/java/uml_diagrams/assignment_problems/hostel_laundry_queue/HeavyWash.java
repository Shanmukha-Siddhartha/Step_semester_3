package uml_diagrams.assignment_problems.hostel_laundry_queue;

public class HeavyWash implements WashType {

    @Override
    public int getDuration() {
        return 60;
    }

    @Override
    public double getCharge() {
        return 45;
    }

    @Override
    public String getName() {
        return "Heavy";
    }
}
