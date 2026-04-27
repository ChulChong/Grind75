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
        ArrayList<int[]> answer = new ArrayList<>();
        for (int[] interval : intervals) {
            if (newInterval[1] < interval[0]) {
                answer.add(newInterval);
                newInterval = interval;
            } else if (newInterval[0] > interval[1]) {
                answer.add(interval);
            } else {
                newInterval = new int[]{Math.min(interval[0], newInterval[0]), Math.max(interval[1], newInterval[1])};
            }
        }
        answer.add(newInterval);
        return answer.toArray(new int[answer.size()][]);
    }

}
