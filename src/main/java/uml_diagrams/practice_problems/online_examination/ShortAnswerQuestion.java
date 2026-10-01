package practice_problems.online_examination;

public class ShortAnswerQuestion extends Question {

    private String correctAnswer;

    public ShortAnswerQuestion(
            String questionText,
            int marks,
            String correctAnswer) {

        super(questionText, marks);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int evaluate(String answer) {

        if (answer != null
                && answer.trim()
                .equalsIgnoreCase(correctAnswer)) {

            return getMarks();
        }

        return 0;
    }
}