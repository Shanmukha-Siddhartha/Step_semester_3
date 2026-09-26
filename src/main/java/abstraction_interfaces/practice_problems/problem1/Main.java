package abstraction_interfaces.practice_problems.problem1;

public class Main {

    public static void main(String[] args) {

        Toy[] toys = {
                new ToyCar("Remote Car"),
                new ToyRobot("Robot Buddy")
        };

        System.out.println(ToyWorkshop.playAll(toys));
    }
}