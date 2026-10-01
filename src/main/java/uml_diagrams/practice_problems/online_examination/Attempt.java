package practice_problems.online_examination;

import java.util.ArrayList;
import java.util.List;

public class Attempt {

    private Student student;
    private Exam exam;
    private List<String> answers;
    private boolean submitted;

    public Attempt(Student student, Exam exam) {
        this.student = student;
        this.exam = exam;
        this.answers = new ArrayList<>();
        this.submitted = false;
    }

    public void answerQuestion(String answer) {

        if (submitted) {
            System.out.println(
                    "Cannot modify answers after submission."
            );
            return;
        }

        answers.add(answer);
    }

    public void submit() {

        if (submitted) {
            System.out.println(
                    "Attempt already submitted."
            );
            return;
        }

        submitted = true;

        int score = 0;

        List<Question> questions =
                exam.getQuestions();

        for (int i = 0; i < questions.size(); i++) {

            String answer =
                    i < answers.size()
                            ? answers.get(i)
                            : "";

            score += questions
                    .get(i)
                    .evaluate(answer);
        }

        System.out.println(
                student.getName()
                        + " scored "
                        + score
                        + " marks."
        );
    }
}