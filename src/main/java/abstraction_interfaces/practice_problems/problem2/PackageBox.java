package abstraction_interfaces.practice_problems.problem2;

public class PackageBox implements Printable {

    private String item;

    public PackageBox(String item) {
        this.item = item;
    }

    @Override
    public String print() {
        return "Package: " + item;
    }
}