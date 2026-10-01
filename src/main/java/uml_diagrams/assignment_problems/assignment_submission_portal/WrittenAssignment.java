package uml_diagrams.assignment_problems.assignment_submission_portal;

public class WrittenAssignment extends Assignment {

    public WrittenAssignment(
            String title,
            int maxMarks,
            int dueDay) {

        super(title, maxMarks, dueDay);
    }

    @Override
    public double applyPenalty(
            double marks,
            int submittedDay) {

        int lateDays = Math.max(
                0,
                submittedDay - getDueDay()
        );

        double penalty = lateDays * 0.20;

        return marks * (1 - penalty);
    }
}