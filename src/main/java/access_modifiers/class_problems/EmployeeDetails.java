package access_modifiers.class_problems;

public class EmployeeDetails {

    private String name;
    private double salary;

    public EmployeeDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void display() {
        System.out.println(
                name + " - " + salary
        );
    }

    public static void main(String[] args) {

        EmployeeDetails employee =
                new EmployeeDetails("Anitha", 50000);

        employee.display();

        employee.setSalary(55000);

        employee.display();
    }
}