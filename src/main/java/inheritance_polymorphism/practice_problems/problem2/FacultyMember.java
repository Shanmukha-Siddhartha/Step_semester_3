package inheritance_polymorphism.practice_problems.problem2;

public class FacultyMember extends LibraryMember {

    private String department;

    public FacultyMember(
            String memberId,
            int borrowLimit,
            String department) {

        super(memberId, borrowLimit);
        this.department = department;
    }

    @Override
    public String displayInfo() {
        return "Faculty Member | Department: " + department
                + " | Books Borrowed: " + booksBorrowed;
    }
}