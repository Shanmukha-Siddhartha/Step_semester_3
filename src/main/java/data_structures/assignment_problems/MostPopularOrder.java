package data_structures.assignment_problems;

import java.util.HashMap;
import java.util.Map;

public class MostPopularOrder {

    static String[] findMostPopular(String[] orders) {
        if (orders.length == 0) {
            return new String[]{"", "0"};
        }

        Map<String, Integer> frequency = new HashMap<>();

        for (String order : orders) {
            frequency.put(order, frequency.getOrDefault(order, 0) + 1);
        }

        String bestItem = orders[0];
        int bestCount = frequency.get(bestItem);

        for (String order : orders) {
            int count = frequency.get(order);

            if (count > bestCount) {
                bestItem = order;
                bestCount = count;
            }
        }

        return new String[]{bestItem, String.valueOf(bestCount)};
    }

    public static void main(String[] args) {
        String[] orders = {
                "dosa", "idli", "vada", "dosa",
                "idli", "dosa", "tea"
        };

        String[] result = findMostPopular(orders);

        System.out.println("(" + result[0] + ", " + result[1] + ")");
    }
}