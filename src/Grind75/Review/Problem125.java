package Grind75.Review;

public class Problem125 {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            char leftChracter = s.charAt(left);
            char rightCarhacter = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChracter)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightCarhacter)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChracter) != Character.toLowerCase(rightCarhacter)) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
