package Grind75.Review;

public class Problem70 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int first = 1;
        int second = 2;
        if (n == 1) return first;
        if (n == 2) return second;
        int totalStep = 0;
        for (int i = 2; i < n; i++) {
            totalStep = first + second;
            first = second;
            second = totalStep;
        }
        return totalStep;
    }
}
