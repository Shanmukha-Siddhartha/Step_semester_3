package inheritance_polymorphism.practice_problems.problem4;

public class LibrarySystem {

    public static String batchPrint(LibraryMember[] members) {

        StringBuilder report = new StringBuilder();

        for (LibraryMember member : members) {

            report.append(member.displayInfo());

            if (member instanceof StudentMember) {

                StudentMember student =
                        (StudentMember) member;

                report.append(
                        " [Course via downcast: "
                                + student.getCourse()
                                + "]"
                );
            }

            report.append(" | ");
        }

        return report.toString();
    }
}