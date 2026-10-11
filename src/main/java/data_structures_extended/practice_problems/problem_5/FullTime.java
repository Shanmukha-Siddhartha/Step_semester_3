package data_structures_extended.practice_problems.problem_5;

class FullTime extends Staff {
    long salary;

    FullTime(String name, long salary) {
        super(name);
        this.salary = salary;
    }

    String getType() { return "FullTime"; }

    long calculatePay() {
        return salary;
    }
}
