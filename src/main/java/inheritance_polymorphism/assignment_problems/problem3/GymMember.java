package inheritance_polymorphism.assignment_problems.problem3;

public class GymMember {
    protected String memberId;
    protected int monthlyFee;

    private int[] lateFeeHistory = new int[10];
    private int feeCount = 0;

    public GymMember(String memberId, int monthlyFee) {
        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
    }

    protected void chargeLateFee(int amount) {
        if (feeCount < lateFeeHistory.length) {
            lateFeeHistory[feeCount++] = amount;
        }
    }

    public int[] getLateFeeHistory() {
        int[] copy = new int[feeCount];

        for (int i = 0; i < feeCount; i++) {
            copy[i] = lateFeeHistory[i];
        }

        return copy;
    }

    public int getTotalLateFees() {
        int total = 0;

        for (int i = 0; i < feeCount; i++) {
            total += lateFeeHistory[i];
        }

        return total;
    }
}