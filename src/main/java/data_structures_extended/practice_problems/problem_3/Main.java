package data_structures_extended.practice_problems.problem_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Student> members = new HashSet<>();

        List<String> addOutputs = new ArrayList<>();
        List<String> containsOutputs = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] p = line.split("\\s+");
            Student s = new Student(p[1], p[2]);

            if (p[0].equals("ADD")) {
                if (members.add(s)) {
                    addOutputs.add("Added");
                } else {
                    addOutputs.add("duplicate rejected");
                }
            } else if (p[0].equals("CONTAINS")) {
                containsOutputs.add(
                        "contains: " + members.contains(s)
                );
            }
        }

        for (String output : addOutputs) {
            System.out.println(output);
        }

        System.out.println("member count " + members.size());

        for (String output : containsOutputs) {
            System.out.println(output);
        }

        sc.close();
    }
}
