class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int longestIndex = 0;
        int longestTime = 0;
        int lastTime = 0;
        for (int[] event : events) {
            int unitOfTime = event[1] - lastTime;
            lastTime = event[1];
            if (longestTime < unitOfTime || (longestTime == unitOfTime && event[0] < longestIndex)) {
                longestTime = unitOfTime;
                longestIndex = event[0];
            }
        }
        return longestIndex;
    }
}