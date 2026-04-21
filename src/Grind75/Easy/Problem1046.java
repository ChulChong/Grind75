package Grind75.Easy;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Problem1046 {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            pq.add(i);
        }
        while (pq.size() >= 2) {
            int rock1 = pq.poll();
            int rock2 = pq.poll();
            if (rock1 != rock2) {
                pq.add(Math.abs(rock2 - rock1));
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
