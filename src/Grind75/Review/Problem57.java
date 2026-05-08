package Grind75.Review;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem57 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();
        boolean inserted = false;
        for (int[] interval : intervals) {
            if (newInterval[0] > interval[1]) {
                list.add(interval);
            } else if (newInterval[1] < interval[0]) {
                if (!inserted) {
                    list.add(newInterval);
                    inserted = true;
                }
                list.add(interval);
            } else {
                newInterval = new int[]{Math.min(interval[0], newInterval[0]), Math.max(interval[1], newInterval[1])};
            }
        }
        if (!inserted) list.add(newInterval);
        return list.toArray(new int[0][]);
    }

}
