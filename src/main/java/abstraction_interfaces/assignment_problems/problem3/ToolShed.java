package abstraction_interfaces.assignment_problems.problem3;

public class ToolShed {

    public static String useAll(GardenTool[] tools) {
        StringBuilder result = new StringBuilder();

        for (GardenTool tool : tools) {
            result.append(tool.use()).append(" | ");
        }

        return result.toString();
    }
}