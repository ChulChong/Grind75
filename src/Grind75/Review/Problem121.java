package Grind75.Review;

public class Problem121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i : prices){
            int currProfit = i - min;
            if(min > i){
                min = i;
            }
            if(maxProfit < currProfit){
                maxProfit = currProfit;
            }
        }
        return maxProfit;
    }


}
