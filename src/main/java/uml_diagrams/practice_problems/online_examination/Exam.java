package practice_problems.online_examination;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private String examName;
    private List<Question> questions;

    public Exam(String examName) {
        this.examName = examName;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public String getExamName() {
        return examName;
    }
}