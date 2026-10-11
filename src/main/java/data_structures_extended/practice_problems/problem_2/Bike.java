package data_structures_extended.practice_problems.problem_2;

class Bike extends Vehicle {
    Bike(String pass, String owner) {
        super(pass, owner);
    }

    String getType() { return "Bike"; }
    int getPassFee() { return 300; }
}
