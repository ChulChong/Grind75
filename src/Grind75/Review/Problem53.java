package Grind75.Review;

public class Problem53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        int i = 0;
        while (i < nums.length) {
            currentSum = currentSum + nums[i];
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0) currentSum = 0;
            i++;
        }
        return maxSum;
    }
}