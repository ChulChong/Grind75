class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        left[0] = 1;
        for(int i = 1; i< ans.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        int product = 1;
        for(int i = nums.length-1; i>=0; i--){
            ans[i] = product * left[i];
            product *= nums[i];
        }
        return ans;
    }
}