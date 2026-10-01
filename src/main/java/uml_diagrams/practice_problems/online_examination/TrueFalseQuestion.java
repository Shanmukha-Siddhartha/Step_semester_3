package practice_problems.online_examination;

public class TrueFalseQuestion extends Question {

    private boolean correctAnswer;

    public TrueFalseQuestion(
            String questionText,
            int marks,
            boolean correctAnswer) {

        super(questionText, marks);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int evaluate(String answer) {

        if (answer == null) {
            return 0;
        }

        boolean userAnswer =
                Boolean.parseBoolean(answer);

        return userAnswer == correctAnswer
                ? getMarks()
                : 0;
    }
}