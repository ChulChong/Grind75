package Grind75.Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem57 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {2, 5};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && intervals[i][1] >= newInterval[0] && intervals[i][0] <= newInterval[1]) {
            newInterval = new int[]{Math.min(newInterval[0], intervals[i][0]), Math.max(newInterval[1], intervals[i][1])};
            i++;
        }
        list.add(newInterval);

        while (i < intervals.length && intervals[i][0] > newInterval[1]) {
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[0][]);
    }

}
