package Grind75.Medium;

import java.util.HashSet;

public class Problem3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int right = 0;
        while (left < s.length() && right < s.length()) {
            if (!hs.contains(s.charAt(right))) {
                hs.add(s.charAt(right));
                right++;
            } else {
                hs.remove(s.charAt(left));
                left++;
            }
            ans = Math.max(ans, hs.size());
        }
        return ans;
    }
}
