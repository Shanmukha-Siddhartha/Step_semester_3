package abstraction_interfaces.assignment_problems.problem3;

public class Pruner extends CuttingTool {

    @Override
    public String use() {
        return super.use() + " | Pruner trims branches";
    }
}