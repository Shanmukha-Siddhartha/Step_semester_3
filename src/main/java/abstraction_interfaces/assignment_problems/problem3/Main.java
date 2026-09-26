package abstraction_interfaces.assignment_problems.problem3;

public class Main {

    public static void main(String[] args) {

        GardenTool[] tools = {
                new CuttingTool(),
                new Pruner()
        };

        System.out.println(ToolShed.useAll(tools));
    }
}