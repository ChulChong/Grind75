class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
        int product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= product;
            product *= nums[i];
        }
        return ans;
    }
}