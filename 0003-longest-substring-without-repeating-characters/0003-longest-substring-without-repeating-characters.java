class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        while (left < s.length() && right < s.length()) {
            while (hs.contains(s.charAt(right))) {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            right++;
            count = Math.max(right - left, count);
        }
        return count;
    }
}