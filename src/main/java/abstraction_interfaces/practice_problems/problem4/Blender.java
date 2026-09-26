package abstraction_interfaces.practice_problems.problem4;

public class Blender extends KitchenTool implements Washable {

    private int speedLevel;

    public Blender(String name) {
        super(name);
        speedLevel = 1;
    }

    @Override
    public String use() {
        return name + " is blending at speed " + speedLevel;
    }

    @Override
    public String wash() {
        return name + " is washed";
    }

    public int getSpeedLevel() {
        return speedLevel;
    }

    public void setSpeedLevel(int speedLevel) {
        this.speedLevel = speedLevel;
    }
}