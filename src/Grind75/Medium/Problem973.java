package Grind75.Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Problem973 {
    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][points[0].length];
        /*PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            int distA = a[0] * a[0] + a[1] * a[1];
            int distB = b[0] * b[0] + b[1] * b[1];
            return distA - distB;
        });*/

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                Comparator.comparingInt(a -> a[0] * a[0] + a[1] * a[1])
        );

        for (int[] point : points) {
            pq.add(point);
        }
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}
