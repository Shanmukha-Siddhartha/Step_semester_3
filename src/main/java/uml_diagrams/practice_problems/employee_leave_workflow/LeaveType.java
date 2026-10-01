package practice_problems.employee_leave_workflow;

public interface LeaveType {

    boolean isValid(int days);

    String getName();
}