class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int remain = target - nums[i];
            if(hm.containsKey(remain)){
                return new int[]{i,hm.get(remain)};
            }
            hm.put(nums[i],i);
        }
        return new int[0];
    }
}