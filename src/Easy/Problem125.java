package Easy;

public class Problem125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(arr[right])) {
                right--;
                continue;
            }
            if (Character.toLowerCase(arr[left]) == Character.toLowerCase(arr[right])) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

}
