package inheritance_polymorphism.practice_problems.problem1;

public class LibrarySystem {

    public static String enrollBatch(String[] memberIds, int borrowLimit) {

        int enrolled = 0;
        int rejected = 0;

        for (String memberId : memberIds) {

            try {
                new LibraryMember(memberId, borrowLimit);
                enrolled++;
            } catch (IllegalArgumentException e) {
                rejected++;
            }
        }

        return "Enrolled: " + enrolled
                + " | Rejected: " + rejected;
    }
}