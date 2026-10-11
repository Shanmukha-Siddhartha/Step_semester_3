import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        List<int[]> marksList = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            line = line.replace("[", "")
                    .replace("]", "")
                    .replace(",", "");

            String[] p = line.split("\\s+");

            names.add(p[0]);

            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                marks[i] = Integer.parseInt(p[i + 1]);
            }

            marksList.add(marks);
        }

        int n = names.size();
        if (n == 0) {
            sc.close();
            return;
        }

        int[][] marks = new int[n][3];
        int[] totals = new int[n];
        double[] subjectTotals = new double[3];

        for (int i = 0; i < n; i++) {
            marks[i] = marksList.get(i);

            for (int j = 0; j < 3; j++) {
                totals[i] += marks[i][j];
                subjectTotals[j] += marks[i][j];
            }
        }

        System.out.print("Totals ");
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(names.get(i) + " " + totals[i]);
        }
        System.out.println();

        System.out.print("averages ");
        for (int j = 0; j < 3; j++) {
            if (j > 0) System.out.print(", ");

            System.out.printf(Locale.US, "%.2f",
                    subjectTotals[j] / n);
        }
        System.out.println();

        int topper = 0;
        for (int i = 1; i < n; i++) {
            if (totals[i] > totals[topper]) {
                topper = i;
            }
        }

        System.out.println("topper " + names.get(topper) +
                " (" + totals[topper] + ")");

        sc.close();
    }
}
