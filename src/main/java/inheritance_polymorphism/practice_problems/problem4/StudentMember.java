package inheritance_polymorphism.practice_problems.problem4;

public class StudentMember extends LibraryMember {

    private String course;

    public StudentMember(
            String memberId,
            int borrowLimit,
            String course) {

        super(memberId, borrowLimit);
        this.course = course;
    }

    @Override
    public String displayInfo() {
        return "Student | Course: " + course
                + " | Books: " + booksBorrowed;
    }

    public String getCourse() {
        return course;
    }
}