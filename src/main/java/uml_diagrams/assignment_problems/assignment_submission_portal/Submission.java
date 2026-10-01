package uml_diagrams.assignment_problems.assignment_submission_portal;

public class Submission {

    private Student student;
    private Assignment assignment;
    private int submittedDay;

    private String status;
    private double finalMarks;

    public Submission(
            Student student,
            Assignment assignment,
            int submittedDay) {

        this.student = student;
        this.assignment = assignment;
        this.submittedDay = submittedDay;
        this.status = "Submitted";
    }

    public void grade(double awardedMarks) {

        if (!status.equals("Submitted")) {
            System.out.println(
                    "Cannot grade this submission."
            );
            return;
        }

        finalMarks = assignment.applyPenalty(
                awardedMarks,
                submittedDay
        );

        status = "Graded";

        System.out.printf(
                "%s: %.0f/%d%n",
                student.getName(),
                finalMarks,
                assignment.getMaxMarks()
        );
    }

    public void resubmit(int newDay) {

        if (status.equals("Graded")) {
            System.out.println(
                    "Cannot resubmit graded assignment."
            );
            return;
        }

        submittedDay = newDay;
        status = "Submitted";
    }

    public String getStatus() {
        return status;
    }

    public double getFinalMarks() {
        return finalMarks;
    }
}