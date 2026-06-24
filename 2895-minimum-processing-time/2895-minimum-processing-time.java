class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks, (a, b) -> b - a);
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i : processorTime) {
            for (int j = index; j < index + 4; j++) {
                max = Math.max(i + tasks.get(j), max);
            }
            index += 4;
        }
        return max;
    }
}