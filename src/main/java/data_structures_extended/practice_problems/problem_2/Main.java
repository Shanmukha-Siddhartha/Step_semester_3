package data_structures_extended.practice_problems.problem_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Vehicle> vehicles = new HashMap<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] p = line.split("\\s+");

            if (p[0].equals("PASS")) {
                String type = p[1];
                String pass = p[2];
                String owner = p[3];

                Vehicle v;

                switch (type) {
                    case "Bike":
                        v = new Bike(pass, owner);
                        break;
                    case "Car":
                        v = new Car(pass, owner);
                        break;
                    case "EBike":
                    case "E-Bike":
                        v = new EBike(pass, owner);
                        break;
                    case "ECar":
                    case "E-Car":
                        v = new ECar(pass, owner);
                        break;
                    default:
                        continue;
                }

                vehicles.put(pass, v);
                System.out.println(v.passNumber + " (" +
                        v.getType() + ") pass fee " + v.getPassFee());

            } else if (p[0].equals("CHARGE")) {
                Vehicle v = vehicles.get(p[1]);

                if (v instanceof Chargeable) {
                    Chargeable c = (Chargeable) v;
                    if (c.bookChargingBay()) {
                        System.out.println(p[1] +
                                " charging bay allotted");
                    }
                } else {
                    System.out.println(p[1] +
                            " rejected: charging unsupported");
                }
            }
        }
        sc.close();
    }
}
