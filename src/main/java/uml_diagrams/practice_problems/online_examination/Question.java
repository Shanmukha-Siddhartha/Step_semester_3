package practice_problems.online_examination;

public abstract class Question {

    private String questionText;
    private int marks;

    public Question(String questionText, int marks) {
        this.questionText = questionText;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getQuestionText() {
        return questionText;
    }

    public abstract int evaluate(String answer);
}