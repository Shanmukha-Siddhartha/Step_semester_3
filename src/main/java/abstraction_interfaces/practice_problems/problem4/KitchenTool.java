package abstraction_interfaces.practice_problems.problem4;

public abstract class KitchenTool {

    protected String name;

    public KitchenTool(String name) {
        this.name = name;
    }

    public abstract String use();
}