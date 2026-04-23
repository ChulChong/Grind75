package Grind75.Review;

public class Problem121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i : prices) {
            int currProfit = i - minPrice;
            maximumProfit = Math.max(currProfit, maximumProfit);
            if (minPrice > i) {
                minPrice = i;
            }
        }
        return maximumProfit;
    }


}
