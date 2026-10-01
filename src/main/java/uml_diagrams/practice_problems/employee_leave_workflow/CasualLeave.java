package practice_problems.employee_leave_workflow;

public class CasualLeave implements LeaveType {

    @Override
    public boolean isValid(int days) {
        return days <= 5;
    }

    @Override
    public String getName() {
        return "Casual Leave";
    }
}