package uml_diagrams.assignment_problems.hostel_laundry_queue;

public class WashingMachine {

    private String machineId;
    private boolean busy;
    private WashCycle currentCycle;

    public WashingMachine(String machineId) {
        this.machineId = machineId;
        this.busy = false;
    }

    public String getMachineId() {
        return machineId;
    }

    public boolean isBusy() {
        return busy;
    }

    public boolean startWash(
            Student student,
            WashType washType) {

        if (busy) {
            return false;
        }

        currentCycle =
                new WashCycle(student, this, washType);

        busy = true;

        System.out.printf(
                "%s wash started on %s for %s (%d min).%n",
                washType.getName(),
                machineId,
                student.getName(),
                washType.getDuration()
        );

        System.out.printf(
                "Charge: ₹%.2f.%n",
                washType.getCharge()
        );

        return true;
    }

    public void completeWash() {

        if (!busy) {
            return;
        }

        System.out.println(
                machineId + " cycle completed."
        );

        busy = false;
        currentCycle = null;

        System.out.println(
                machineId + " is now free."
        );
    }
}