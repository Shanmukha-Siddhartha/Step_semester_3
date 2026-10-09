package data_structures.assignment_problems;

public class HotWeatherAlert {

    static int countHotWindows(int[] readings, int k, int threshold) {
        if (k <= 0 || k > readings.length) {
            return 0;
        }

        int windowSum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            windowSum += readings[i];
        }

        if (windowSum >= k * threshold) {
            count++;
        }

        for (int i = k; i < readings.length; i++) {
            windowSum += readings[i] - readings[i - k];

            if (windowSum >= k * threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] readings = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;

        System.out.println(countHotWindows(readings, k, threshold));
    }
}