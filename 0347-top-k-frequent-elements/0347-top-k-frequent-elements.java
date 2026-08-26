class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(hm.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = entries.get(i).getKey();
        }
        return arr;
    }
}