package Grind75.Easy;

import java.util.HashMap;

public class Problem409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (char c : s.toCharArray()) {
            arr[c]++;
        }
        int totalPalindrome = 0;
        boolean hasOdd = false;
        for (int i : arr) {
            if (i == 0) continue;
            totalPalindrome += i / 2 * 2;
            if (i % 2 != 0) {
                hasOdd = true;
            }
        }
        return hasOdd ? totalPalindrome + 1 : totalPalindrome;
    }
}
