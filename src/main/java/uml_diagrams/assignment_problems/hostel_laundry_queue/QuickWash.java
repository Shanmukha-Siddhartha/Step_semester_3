package uml_diagrams.assignment_problems.hostel_laundry_queue;

public class QuickWash implements WashType {

    @Override
    public int getDuration() {
        return 30;
    }

    @Override
    public double getCharge() {
        return 20;
    }

    @Override
    public String getName() {
        return "Quick";
    }
}