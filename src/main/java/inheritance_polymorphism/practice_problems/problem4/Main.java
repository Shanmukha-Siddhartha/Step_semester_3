package inheritance_polymorphism.practice_problems.problem4;

public class Main {

    public static void main(String[] args) {

        LibraryMember general =
                new LibraryMember("LB5", 3);

        StudentMember student =
                new StudentMember("STU6", 3, "ECE");

        LibraryMember[] members = {
                general,
                student
        };

        System.out.println(
                LibrarySystem.batchPrint(members)
        );
    }
}