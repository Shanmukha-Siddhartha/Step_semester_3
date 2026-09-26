package abstraction_interfaces.practice_problems.problem2;

public class Main {

    public static void main(String[] args) {

        Printable[] items = {
                new PackageBox("Laptop"),
                new Invoice(25000)
        };

        System.out.println(PrintStation.printAll(items));
    }
}