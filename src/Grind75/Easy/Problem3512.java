package Grind75.Easy;

public class Problem3512 {
    public static void main(String[] args) {
        int[] nums = {3, 9, 7};
        int k = 5;
        System.out.println(minOperations(nums, k));
    }

    public static int minOperations(int[] nums, int k) {
        int sums = 0;
        for (int i : nums) {
            sums += i;
        }
        return sums % k;
    }
}
