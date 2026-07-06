class Solution {
    public String longestPalindrome(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            int[] arr = expand(s, i, i);
            int[] arr2 = expand(s, i, i + 1);
            if (arr[2] > answer.length()) {
                answer = s.substring(arr[0], arr[1]);
            }
            if (arr2[2] > answer.length()) {
                answer = s.substring(arr2[0], arr2[1]);
            }

        }
        return answer;
    }

    public int[] expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return new int[] { left + 1, right, right - left - 1 };
    }
}