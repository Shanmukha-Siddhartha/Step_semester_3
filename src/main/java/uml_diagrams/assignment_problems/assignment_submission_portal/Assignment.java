package uml_diagrams.assignment_problems.assignment_submission_portal;

public abstract class Assignment {

    private String title;
    private int maxMarks;
    private int dueDay;

    public Assignment(String title, int maxMarks, int dueDay) {
        this.title = title;
        this.maxMarks = maxMarks;
        this.dueDay = dueDay;
    }

    public String getTitle() {
        return title;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getDueDay() {
        return dueDay;
    }

    public abstract double applyPenalty(
            double marks,
            int submittedDay);
}