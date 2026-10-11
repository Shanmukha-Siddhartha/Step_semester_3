package data_structures_extended.practice_problems.problem_5;

class PartTime extends Staff {
    long hours, rate;

    PartTime(String name, long hours, long rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    String getType() { return "PartTime"; }

    long calculatePay() {
        return hours * rate;
    }
}
