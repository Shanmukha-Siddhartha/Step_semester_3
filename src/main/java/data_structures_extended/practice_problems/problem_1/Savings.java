package data_structures_extended.practice_problems.problem_1;

class Savings extends BankAccount {
    Savings(String id, long balance) {
        super(id, balance);
    }

    @Override
    String withdraw(long amount) {
        if (balance - amount < 1000) {
            return id + " rejected: minimum balance 1000";
        }
        return super.withdraw(amount);
    }
}

