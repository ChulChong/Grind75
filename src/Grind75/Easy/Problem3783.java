package Grind75.Easy;

public class Problem3783 {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(mirrorDistance(n));
    }

    public static int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

    public static int reverse(int n) {
        StringBuilder sb = new StringBuilder();
        return Integer.parseInt(sb.append(String.valueOf(n)).reverse().toString());
    }
}
