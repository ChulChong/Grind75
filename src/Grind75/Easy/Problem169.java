package Grind75.Easy;

import java.util.HashMap;

public class Problem169 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                ans = i;
            }
            if (ans != i) {
                count--;
            } else {
                count++;
            }
        }
        return ans;
    }
}
