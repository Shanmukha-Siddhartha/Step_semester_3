package practice_problems.employee_leave_workflow;

public class MedicalLeave implements LeaveType {

    @Override
    public boolean isValid(int days) {
        return days <= 10;
    }

    @Override
    public String getName() {
        return "Medical Leave";
    }
}