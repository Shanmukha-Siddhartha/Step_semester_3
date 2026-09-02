package object_oriented_programming.assignment_problems;

public class CollegeSetup {
    static String collegeName;
    static String academicYear;

    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2026-27";
        System.out.println("College information loaded");
    }

    String studentName;

    CollegeSetup(String studentName) {
        this.studentName = studentName;
    }

    void printConfirmation() {
        System.out.println(
                studentName + " registered at " +
                        collegeName + " for " + academicYear
        );
    }

    public static void main(String[] args) {
        String[] names = {
                "Ravi",
                "Anitha",
                "Karthik",
                "Meera",
                "Arjun"
        };

        CollegeSetup[] students = new CollegeSetup[names.length];

        for (int i = 0; i < names.length; i++) {
            students[i] = new CollegeSetup(names[i]);
            students[i].printConfirmation();
        }
    }
}