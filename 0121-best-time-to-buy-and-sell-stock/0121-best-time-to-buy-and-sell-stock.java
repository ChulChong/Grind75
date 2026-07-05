class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int maxP = 0;
        for (int i : prices) {
            if(i < low) low = i;
            int profit = i - low;
            maxP = Math.max(maxP, profit);
        }
        return maxP;
    }
}