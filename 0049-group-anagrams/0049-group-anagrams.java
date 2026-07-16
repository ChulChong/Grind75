class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);
            if(hm.containsKey(word)){
                hm.get(word).add(str);
            }else{
                hm.putIfAbsent(word, new ArrayList<>());
                hm.get(word).add(str);
            }
        }
        return new ArrayList<>(hm.values());
    }
}