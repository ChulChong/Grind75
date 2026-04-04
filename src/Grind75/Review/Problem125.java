package Grind75.Review;

public class Problem125 {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        while (leftIndex < rightIndex) {
            if (!Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex = leftIndex + 1;
            } else if (!Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex = rightIndex - 1;
            } else {
                if (Character.toLowerCase(s.charAt(leftIndex)) != Character.toLowerCase(s.charAt(rightIndex))) {
                    return false;
                }
                leftIndex++;
                rightIndex--;
            }

        }
        return true;
    }
}
