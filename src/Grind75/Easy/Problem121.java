package Grind75.Easy;

public class Problem121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i : prices) {
            minPrice = Math.min(minPrice, i);
            int profitToday = i - minPrice;
            maxProfit = Math.max(maxProfit, profitToday);
        }
        return maxProfit;
    }


}
