class Solution {
    public String longestPalindrome(String s) {
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            int[] odd = expand(s, i, i);
            int[] even = expand(s, i, i + 1);
            if (word.length() < odd[2]) {
                word = s.substring(odd[0], odd[1]);
            }
            if (word.length() < even[2]) {
                word = s.substring(even[0], even[1]);
            }
        }
        return word;
    }

    private int[] expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return new int[] { left+1, right, right - left - 1 };
    }

}