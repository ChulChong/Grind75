class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int maxNum = 0;
        for (int[] box : boxTypes) {
            int howMany = Math.min(truckSize, box[0]);
            maxNum += howMany * box[1];
            truckSize -= howMany;
            if (truckSize == 0)
                break;
        }
        return maxNum;
    }
}