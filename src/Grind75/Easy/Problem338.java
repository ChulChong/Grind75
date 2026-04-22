package Grind75.Easy;

import java.util.Arrays;

public class Problem338 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(countBits(n)));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int num = i;
            int count = 0;
            while (num != 0) {
                if (num % 2 == 1) count++;
                num = num >> 1;
            }
            ans[i] = count;
        }
        return ans;
    }
}
