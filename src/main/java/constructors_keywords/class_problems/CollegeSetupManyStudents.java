package constructors_keywords.class_problems;

class SrmStudent {

    static String collegeName;
    static String academicYear;

    String name;

    // Static block executes only once
    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2026-2027";

        System.out.println("College info loaded");
    }

    SrmStudent(String name) {
        this.name = name;
    }

    void printConfirmation() {
        System.out.println("Student record created: " + name);
    }
}

public class CollegeSetupManyStudents {
    public static void main(String[] args) {

        String[] names = {
                "Ravi",
                "Meera",
                "Karthik",
                "Divya",
                "Anitha"
        };

        for (String name : names) {
            SrmStudent student = new SrmStudent(name);
            student.printConfirmation();
        }
    }
}