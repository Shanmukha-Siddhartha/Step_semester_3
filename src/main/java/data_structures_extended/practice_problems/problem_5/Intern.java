package data_structures_extended.practice_problems.problem_5;

class Intern extends Staff {
    long stipend;

    Intern(String name, long stipend) {
        super(name);
        this.stipend = stipend;
    }

    String getType() { return "Intern"; }

    long calculatePay() {
        return stipend;
    }
}
