package practice_problems.online_examination;

public class MCQQuestion extends Question {

    private String correctAnswer;

    public MCQQuestion(
            String questionText,
            int marks,
            String correctAnswer) {

        super(questionText, marks);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int evaluate(String answer) {

        if (answer != null
                && answer.equalsIgnoreCase(correctAnswer)) {

            return getMarks();
        }

        return 0;
    }
}