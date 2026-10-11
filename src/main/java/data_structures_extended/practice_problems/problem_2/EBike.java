package data_structures_extended.practice_problems.problem_2;

class EBike extends Vehicle implements Chargeable {
    EBike(String pass, String owner) {
        super(pass, owner);
    }

    String getType() { return "EBike"; }
    int getPassFee() { return 300; }

    public boolean bookChargingBay() {
        return true;
    }
}