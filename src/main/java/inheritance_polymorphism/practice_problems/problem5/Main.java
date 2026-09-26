package inheritance_polymorphism.practice_problems.problem5;

public class Main {

    public static void main(String[] args) {

        LibraryMember m1 =
                new LibraryMember(3);

        System.out.println(
                m1.getMemberNumber()
        );

        System.out.println(
                LibraryMember.getMembersEnrolled()
        );

        System.out.println(
                LibraryMember.isValidRenewalCode("R12A")
        );

        System.out.println(
                LibraryMember.isValidRenewalCode("R1A")
        );

        System.out.println(
                LibraryMember.isValidRenewalCode("X12A")
        );

        m1.borrowBook();
        m1.borrowBook("Fiction");

        System.out.println(
                m1.getBooksBorrowed()
        );

        System.out.println(
                LibraryMember.processNightlyAudit(
                        new LibraryMember[]{
                                new FacultyMember(5, "Physics"),
                                null,
                                new LibraryMember(3)
                        }
                )
        );
    }
}