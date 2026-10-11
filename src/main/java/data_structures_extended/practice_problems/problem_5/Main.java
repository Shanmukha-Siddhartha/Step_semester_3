package data_structures_extended.practice_problems.problem_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Payslip> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] p = line.split("\\s+");
            Staff staff;

            switch (p[0]) {
                case "FullTime":
                    staff = new FullTime(
                            p[1], Long.parseLong(p[2]));
                    break;

                case "PartTime":
                    staff = new PartTime(
                            p[1],
                            Long.parseLong(p[2]),
                            Long.parseLong(p[3]));
                    break;

                case "Intern":
                    staff = new Intern(
                            p[1], Long.parseLong(p[2]));
                    break;

                default:
                    continue;
            }

            list.add(new Payslip(staff));
        }

        Payslip[] payslips = list.toArray(new Payslip[0]);

        long total = 0;
        int topper = -1;

        for (int i = 0; i < payslips.length; i++) {
            System.out.println(payslips[i]);
            total += payslips[i].pay;

            if (topper == -1 ||
                    payslips[i].pay > payslips[topper].pay) {
                topper = i;
            }
        }

        System.out.println("Total " + total);

        if (topper != -1) {
            System.out.println("top earner " +
                    payslips[topper].name);
        }

        sc.close();
    }
}