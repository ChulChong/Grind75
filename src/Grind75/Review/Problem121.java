package Grind75.Review;

public class Problem121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestSeen = Integer.MAX_VALUE;
        for (int i : prices) {
            int currProfit = i - lowestSeen;
            if (lowestSeen > i) lowestSeen = i;
            if (currProfit > maxProfit) maxProfit = currProfit;
        }

        return maxProfit;
    }


}
