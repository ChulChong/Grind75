package Grind75.Review;

public class Problem67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int first = a.length() - 1;
        int second = b.length() - 1;
        int carry = 0;
        while (first >= 0 || second >= 0 || carry != 0) {
            int sum = carry;
            if (first >= 0) sum += a.charAt(first--) - '0';
            if (second >= 0) sum += b.charAt(second--) - '0';
            carry = sum / 2;
            sb.append(sum % 2);
        }
        return sb.reverse().toString();
    }
}
