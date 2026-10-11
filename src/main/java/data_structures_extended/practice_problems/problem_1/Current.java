package data_structures_extended.practice_problems.problem_1;

class Current extends BankAccount {
    Current(String id, long balance) {
        super(id, balance);
    }

    @Override
    String withdraw(long amount) {
        if (balance - amount < -5000) {
            return id + " rejected: overdraft limit 5000";
        }
        return super.withdraw(amount);
    }
}
