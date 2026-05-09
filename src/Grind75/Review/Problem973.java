package Grind75.Review;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem973 {
    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt((int[] a) ->
                a[0] * a[0] + a[1] * a[1]
        ).reversed());
        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > k) pq.poll();
        }

        return pq.toArray(new int[k][]);
    }
}
