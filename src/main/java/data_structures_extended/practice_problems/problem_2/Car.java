package data_structures_extended.practice_problems.problem_2;

class Car extends Vehicle {
    Car(String pass, String owner) {
        super(pass, owner);
    }

    String getType() { return "Car"; }
    int getPassFee() { return 1000; }
}
