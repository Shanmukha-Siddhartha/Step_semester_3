package inheritance_polymorphism.practice_problems.problem3;

public class LibraryMember {

    protected String memberId;
    protected int borrowLimit;

    private int[] fineHistory;
    private int fineCount;

    public LibraryMember(String memberId, int borrowLimit) {
        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
        this.fineHistory = new int[10];
        this.fineCount = 0;
    }

    protected void chargeFine(int amount) {

        if (fineCount < 10) {
            fineHistory[fineCount] = amount;
            fineCount++;
        }
    }

    public int[] getFineHistory() {

        int[] history = new int[fineCount];

        for (int i = 0; i < fineCount; i++) {
            history[i] = fineHistory[i];
        }

        return history;
    }

    public int getTotalFine() {

        int total = 0;

        for (int i = 0; i < fineCount; i++) {
            total += fineHistory[i];
        }

        return total;
    }
}