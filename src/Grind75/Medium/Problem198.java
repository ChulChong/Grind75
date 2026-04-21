package Grind75.Medium;

public class Problem198 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int curr = Math.max(second, first + nums[i]);
            first = second;
            second = curr;
        }
        return Math.max(first, second);
    }
}
