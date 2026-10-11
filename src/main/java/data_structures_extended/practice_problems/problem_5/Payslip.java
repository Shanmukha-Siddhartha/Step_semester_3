package data_structures_extended.practice_problems.problem_5;

class Payslip {
    String name;
    String type;
    long pay;

    Payslip(Staff staff) {
        name = staff.name;
        type = staff.getType();
        pay = staff.calculatePay();
    }

    @Override
    public String toString() {
        return "Payslip[name=" + name +
                ", type=" + type +
                ", pay=" + pay + "]";
    }
}
