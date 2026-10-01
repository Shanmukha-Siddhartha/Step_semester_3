package uml_diagrams.assignment_problems.assignment_submission_portal;

public class Main {

    public static void main(String[] args) {

        Student asha = new Student("Asha");
        Student ravi = new Student("Ravi");

        Assignment coding =
                new CodingAssignment(
                        "Linked List Lab",
                        50,
                        10
                );

        Assignment written =
                new WrittenAssignment(
                        "Design Essay",
                        50,
                        12
                );

        Submission ashaSubmission =
                new Submission(
                        asha,
                        coding,
                        10
                );

        Submission raviSubmission =
                new Submission(
                        ravi,
                        written,
                        14
                );

        ashaSubmission.grade(45);
        raviSubmission.grade(40);

        ashaSubmission.resubmit(11);
    }
}