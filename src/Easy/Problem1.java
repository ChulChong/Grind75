package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Problem1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if (hm.containsKey(rest)) {
                return new int[]{hm.get(rest), i};
            }
            hm.put(nums[i], i);
        }
        return null;
    }
}
