package abstraction_interfaces.practice_problems.problem4;

public class Main {

    public static void main(String[] args) {

        Blender blender = new Blender("Mixer");

        System.out.println(Kitchen.operate(blender));
    }
}