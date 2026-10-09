package data_structures.assignment_problems;

public class TicketPriceSlotFinder {

    static int findSlot(int[] prices, int target) {
        int left = 0;
        int right = prices.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (prices[mid] == target) {
                return mid;
            } else if (prices[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] prices = {120, 150, 200, 260};

        System.out.println(findSlot(prices, 150));
        System.out.println(findSlot(prices, 210));
        System.out.println(findSlot(prices, 300));
    }
}