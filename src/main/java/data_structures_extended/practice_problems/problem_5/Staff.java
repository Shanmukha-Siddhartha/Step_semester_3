package data_structures_extended.practice_problems.problem_5;

abstract class Staff {
    String name;

    Staff(String name) {
        this.name = name;
    }

    abstract String getType();
    abstract long calculatePay();
}
