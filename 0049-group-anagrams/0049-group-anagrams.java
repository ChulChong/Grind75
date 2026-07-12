class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);
            hm.putIfAbsent(word, new ArrayList<>());
            hm.get(word).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}