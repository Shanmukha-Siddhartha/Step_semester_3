package inheritance_polymorphism.practice_problems.problem2;

public class StudentMember extends LibraryMember {

    protected String course;

    public StudentMember(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }

    @Override
    public String displayInfo() {
        return "Student Member | Course: " + course
                + " | Books Borrowed: " + booksBorrowed;
    }
}