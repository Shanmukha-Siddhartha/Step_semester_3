package inheritance_polymorphism.practice_problems.problem1;

public class Main {

    public static void main(String[] args) {

        StudentMember student =
                new StudentMember("STU10", 3, "CSE");

        student.borrowBook();
        student.borrowBook();

        System.out.println(student.getBooksBorrowed());

        String[] memberIds = {
                "STU1", "LB1", "STU2", " ", "STU3"
        };

        System.out.println(
                LibrarySystem.enrollBatch(memberIds, 3)
        );
    }
}