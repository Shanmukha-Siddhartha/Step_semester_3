package object_oriented_programming.assignment_problems;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void raiseSalary(double salary) {
        this.salary += salary;
    }

    void printSalary() {
        System.out.println(name + " - " + salary);
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ravi", 40000),
                new Employee("Anitha", 55000),
                new Employee("Karthik", 62000),
                new Employee("Meera", 48000)
        };

        for (Employee employee : employees) {
            employee.raiseSalary(5000);
        }

        for (Employee employee : employees) {
            employee.printSalary();
        }
    }
}