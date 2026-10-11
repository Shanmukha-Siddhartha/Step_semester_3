package data_structures_extended.practice_problems.problem_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, BankAccount> accounts = new HashMap<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] p = line.split("\\s+");

            if (p[0].equals("Savings")) {
                accounts.put(p[1],
                        new Savings(p[1], Long.parseLong(p[2])));
            } else if (p[0].equals("Current")) {
                accounts.put(p[1],
                        new Current(p[1], Long.parseLong(p[2])));
            } else if (p[0].equals("WITHDRAW")) {
                BankAccount account = accounts.get(p[1]);
                long amount = Long.parseLong(p[2]);

                if (account == null) {
                    System.out.println("Account not found");
                } else {
                    System.out.println(account.withdraw(amount));
                }
            }
        }
        sc.close();
    }
}