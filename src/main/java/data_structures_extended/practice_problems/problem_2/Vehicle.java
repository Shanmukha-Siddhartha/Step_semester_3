package data_structures_extended.practice_problems.problem_2;

abstract class Vehicle {
    String passNumber;
    String owner;

    Vehicle(String passNumber, String owner) {
        this.passNumber = passNumber;
        this.owner = owner;
    }

    abstract String getType();
    abstract int getPassFee();
}
