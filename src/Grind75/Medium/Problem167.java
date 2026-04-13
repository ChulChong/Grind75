package Grind75.Medium;

import java.util.Arrays;

public class Problem167 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[right] + numbers[left] > target) {
                right--;
            } else if (numbers[right] + numbers[left] < target) {
                left++;
            }
            if (numbers[right] + numbers[left] == target) {
                return new int[]{left, right};
            }
        }
        return null;
    }
}
