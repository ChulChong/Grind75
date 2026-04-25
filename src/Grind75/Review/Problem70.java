package Grind75.Review;

public class Problem70 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int init = 1;
        int prev = 2;
        for (int i = 3; i <= n; i++) {
            int curr = init + prev;
            init = prev;
            prev = curr;
        }
        return prev;
    }
}
