package data_structures_extended.practice_problems.problem_2;

class ECar extends Vehicle implements Chargeable {
    ECar(String pass, String owner) {
        super(pass, owner);
    }

    String getType() { return "ECar"; }
    int getPassFee() { return 1000; }

    public boolean bookChargingBay() {
        return true;
    }
}