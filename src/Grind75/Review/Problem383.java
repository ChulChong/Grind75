package Grind75.Review;

public class Problem383 {
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            arr[c - 'a']--;
            if (arr[c - 'a'] < 0) return false;
        }
        return true;
    }
}
