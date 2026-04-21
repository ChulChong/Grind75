package Grind75.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Problem703 {

    private final int k;
    private final PriorityQueue<Integer> heap;

    public Problem703(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<>();
        for (int i : nums) {
            this.heap.add(i);
        }
        while (heap.size() > k) {
            heap.poll();
        }
    }

    public int add(int val) {
        heap.add(val);
        if (heap.size() > this.k) heap.poll();
        return heap.peek();
    }
}
