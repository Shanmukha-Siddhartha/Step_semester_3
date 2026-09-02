package constructors_keywords.class_problems;

class Employee {
    String id;
    double salary;

    // Constructor with naming clash
    Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    // Parameter salary clashes with instance variable salary
    void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    void printSalary() {
        System.out.println(id + " | Final Salary: Rs " + salary);
    }
}

public class PayrollBatchBonusRound {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("E-101", 40000),
                new Employee("E-102", 55000),
                new Employee("E-103", 62000),
                new Employee("E-104", 48000)
        };

        double bonus = 5000;

        for (Employee employee : employees) {
            employee.raiseSalary(bonus);
            employee.printSalary();
        }
    }
}