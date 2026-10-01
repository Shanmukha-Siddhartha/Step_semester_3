package practice_problems.online_examination;

public class Main {

    public static void main(String[] args) {

        Exam exam =
                new Exam("Java Basics");

        exam.addQuestion(
                new MCQQuestion(
                        "Which keyword is used for inheritance?",
                        2,
                        "extends"
                )
        );

        exam.addQuestion(
                new TrueFalseQuestion(
                        "Java supports OOP.",
                        2,
                        true
                )
        );

        exam.addQuestion(
                new ShortAnswerQuestion(
                        "What is the parent class of all Java classes?",
                        2,
                        "Object"
                )
        );

        Student student =
                new Student("John");

        Attempt attempt =
                new Attempt(student, exam);

        attempt.answerQuestion("extends");
        attempt.answerQuestion("true");
        attempt.answerQuestion("Object");

        attempt.submit();

        attempt.answerQuestion("Wrong");
        attempt.submit();
    }
}