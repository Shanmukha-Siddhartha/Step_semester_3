package practice_problems.employee_leave_workflow;

public class LeaveRequest {

    private Employee employee;
    private LeaveType leaveType;
    private String startDate;
    private String endDate;
    private String status;

    public LeaveRequest(
            Employee employee,
            LeaveType leaveType,
            String startDate,
            String endDate) {

        this.employee = employee;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending";
    }

    public void approve() {

        if (!status.equals("Pending")) {
            System.out.println(
                    "Request cannot be approved."
            );
            return;
        }

        status = "Approved";

        System.out.println(
                employee.getName()
                        + " leave request approved."
        );
    }

    public void reject() {

        if (!status.equals("Pending")) {
            System.out.println(
                    "Request cannot be rejected."
            );
            return;
        }

        status = "Rejected";

        System.out.println(
                employee.getName()
                        + " leave request rejected."
        );
    }

    public void setPending() {

        if (!status.equals("Pending")) {
            System.out.println(
                    "Cannot revert "
                            + status
                            + " request to Pending."
            );
            return;
        }

        status = "Pending";
    }

    public String getStatus() {
        return status;
    }

    public String getLeaveType() {
        return leaveType.getName();
    }
}