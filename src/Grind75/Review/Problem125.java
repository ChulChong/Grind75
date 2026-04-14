package Grind75.Review;

public class Problem125 {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftCharacter = s.charAt(left);
            char rightCharacter = s.charAt(right);
            if (!Character.isLetterOrDigit(leftCharacter)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightCharacter)) {
                right--;
            } else {
                if (Character.toLowerCase(leftCharacter) == Character.toLowerCase(rightCharacter)) {
                    left++;
                    right--;
                } else return false;
            }
        }
        return true;
    }
}
