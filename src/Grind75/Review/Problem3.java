package Grind75.Review;

import java.util.HashSet;

public class Problem3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int right = 0;
        int ans = 0;
        while (left < s.length() && right < s.length()) {
            if (!hs.contains(s.charAt(left))) {
                hs.add(s.charAt(left++));
            } else {
                hs.remove(s.charAt(right++));
            }
            ans = Math.max(ans, hs.size());
        }
        return ans;
    }
}
