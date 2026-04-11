package Grind75.Easy;

import java.util.HashSet;

public class Problem217 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if (!hs.add(i)) return true;
        }
        return false;
    }
}
