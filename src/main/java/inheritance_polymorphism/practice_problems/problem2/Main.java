package inheritance_polymorphism.practice_problems.problem2;

public class Main {

    public static void main(String[] args) {

        LibraryMember student =
                new StudentMember("STU2", 3, "CSE");

        LibraryMember honors =
                new HonorsStudentMember("STU3", 3, "ECE", 2);

        LibraryMember faculty =
                new FacultyMember("STU4", 5, "Physics");

        student.borrowBook();
        student.borrowBook();

        honors.borrowBook();

        faculty.borrowBook();
        faculty.borrowBook();
        faculty.borrowBook();

        System.out.println(student.displayInfo());
        System.out.println(honors.displayInfo());
        System.out.println(faculty.displayInfo());

        System.out.println(
                LibrarySystem.classifyGeneration(honors)
        );

        System.out.println(
                LibrarySystem.classifyGeneration(faculty)
        );

        System.out.println(
                LibrarySystem.getTotalBooksBorrowed(
                        new LibraryMember[]{
                                student, honors, faculty
                        }
                )
        );
    }
}