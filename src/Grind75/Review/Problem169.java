package Grind75.Review;

public class Problem169 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int majorNumber = nums[0];
        int counter = 0;
        for (int i : nums) {
            if (majorNumber == i) {
                counter++;
            } else if (counter == 0) {
                majorNumber = i;
            } else {
                counter--;
            }
        }
        return majorNumber;
    }
}
