package Grind75.Review;

public class Problem409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    /*public static int longestPalindrome(String s) {
        int[] arr = new int[52];
        int count = 0;
        boolean isOdd = false;
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                arr[c - 'a']++;
            } else {
                arr[c - 'A' + 26]++;
            }
        }
        for (int i : arr) {
            if (i == 0) continue;
            if (i % 2 == 0) {
                count += i;
            } else {
                count += (i / 2) * 2;
                isOdd = true;
            }
        }
        return isOdd ? count + 1 : count;
    }*/

    public static int longestPalindrome(String s) {
        int[] arr = new int[128];
        int totalLength = 0;
        boolean isOdd = false;
        for (char c : s.toCharArray()) {
            arr[c]++;
        }
        for (int i : arr) {
            if (i == 0) continue;
            totalLength += i / 2 * 2;
            if (i % 2 != 0) isOdd = true;
        }
        return isOdd ? totalLength + 1 : totalLength;
    }
}
