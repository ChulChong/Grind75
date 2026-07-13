class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int currentProfit = prices[i] - minPrice;
            max = Math.max(currentProfit, max);
            minPrice = Math.min(minPrice,prices[i]);
        }
        return max;
    }
}