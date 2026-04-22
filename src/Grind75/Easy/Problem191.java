package Grind75.Easy;

public class Problem191 {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n >= 1) {
            if ((n & 1) == 1) count++;
            n = n >> 1;
        }
        return count;
    }
}
