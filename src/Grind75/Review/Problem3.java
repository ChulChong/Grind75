package Grind75.Review;

import java.util.HashSet;
import java.util.Set;

public class Problem3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            while (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(i));
            count = Math.max(count, i - left + 1);
        }
        return count;
    }
}
