package object_oriented_programming.class_problems;

public class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        Course c1 = new Course("AI301", "Artificial Intelligence", 3, 1);
        Course c2 = new Course("ML301", "Machine Learning", 4);

        System.out.println(c1.code + " - Total Credits: " + c1.totalCredits());
        System.out.println(c2.code + " - Total Credits: " + c2.totalCredits());
    }
}