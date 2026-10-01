package practice_problems.employee_leave_workflow;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John");
        Employee jane = new Employee("Jane");

        LeaveRequest johnRequest =
                new LeaveRequest(
                        john,
                        new CasualLeave(),
                        "10-10-2026",
                        "12-10-2026"
                );

        LeaveRequest janeRequest =
                new LeaveRequest(
                        jane,
                        new MedicalLeave(),
                        "15-10-2026",
                        "17-10-2026"
                );

        johnRequest.approve();
        janeRequest.reject();

        johnRequest.setPending();
    }
}