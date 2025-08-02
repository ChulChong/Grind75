package Grind75.Easy;

public class Problem121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int MinPriceSofar = prices[0];
        int MaxProfit = 0;
        for (int i : prices) {
            if (i < MinPriceSofar) {
                MinPriceSofar = i;
            }
            MaxProfit = Math.max(MaxProfit, i - MinPriceSofar);
        }
        return MaxProfit;
    }
}
