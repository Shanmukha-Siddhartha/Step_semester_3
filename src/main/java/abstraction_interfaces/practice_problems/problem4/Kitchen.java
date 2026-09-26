package abstraction_interfaces.practice_problems.problem4;

public class Kitchen {

    public static String operate(Blender blender) {

        blender.setSpeedLevel(3);

        return blender.use()
                + " | "
                + blender.wash();
    }
}