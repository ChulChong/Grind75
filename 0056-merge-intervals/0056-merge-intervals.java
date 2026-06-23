class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] current = intervals[0];
        for (int[] interval : intervals) {
            if (current[1] >= interval[0]) {
                current = new int[] { Math.min(current[0], interval[0]),
                        Math.max(current[1], interval[1]) };
            } else if (current[1] <= interval[0]) {
                list.add(current);
                current = interval;
            }

        }
        list.add(current);
        return list.toArray(new int[0][]);
    }
}