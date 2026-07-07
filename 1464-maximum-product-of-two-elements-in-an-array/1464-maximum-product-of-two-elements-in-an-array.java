class Solution {
    public int maxProduct(int[] nums) {
        int firstNumber = 0;
        int secondNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]> firstNumber) {
                secondNumber = firstNumber;
                firstNumber = nums[i];               
            }else if(nums[i] > secondNumber){
                secondNumber = nums[i];
            }
        }
        return (firstNumber - 1) * (secondNumber - 1);
    }
}