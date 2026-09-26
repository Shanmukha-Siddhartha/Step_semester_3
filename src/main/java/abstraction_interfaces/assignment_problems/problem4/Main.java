package abstraction_interfaces.assignment_problems.problem4;

public class Main {

    public static void main(String[] args) {

        ClassroomDevice device = new Tablet();

        System.out.println(Classroom.setup(device));
    }
}