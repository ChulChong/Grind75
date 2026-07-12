class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.putIfAbsent(i, 0);
            hm.put(i,hm.get(i)+1);
        }
        List<Integer> keys = new ArrayList<>(hm.keySet());
        keys.sort((a,b)->hm.get(b)-hm.get(a));
        int[] arr = new int[k];
        for(int i = 0; i < k; i++) arr[i] = keys.get(i);
        return arr;
    }
}