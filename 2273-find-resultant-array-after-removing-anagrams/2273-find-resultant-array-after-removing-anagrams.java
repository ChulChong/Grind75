class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!sorted(words[i]).equals(sorted(words[i - 1]))) {
                ans.add(words[i]);
            }
        }
        return ans;
    }

    private String sorted(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}