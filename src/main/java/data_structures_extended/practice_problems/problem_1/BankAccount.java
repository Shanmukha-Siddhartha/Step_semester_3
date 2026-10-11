package data_structures_extended.practice_problems.problem_1;

class BankAccount {
    String id;
    long balance;

    BankAccount(String id, long balance) {
        this.id = id;
        this.balance = balance;
    }

    String withdraw(long amount) {
        balance -= amount;
        return id + " balance " + balance;
    }
}

