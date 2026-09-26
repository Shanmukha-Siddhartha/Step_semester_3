package abstraction_interfaces.assignment_problems.problem4;

public class Classroom {

    public static String setup(ClassroomDevice device) {
        Tablet tablet = (Tablet) device;

        return device.operate()
                + " | "
                + tablet.charge()
                + " | "
                + tablet.charge(30);
    }
}