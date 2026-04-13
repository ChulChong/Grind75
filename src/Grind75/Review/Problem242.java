package Grind75.Review;

import java.util.HashMap;

public class Problem242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] arr = new int[26];
        for (char c : s.toCharArray()) arr[c - 'a']++;
        for (char c : t.toCharArray()) arr[c - 'a']--;

        for (int i : arr) if (i != 0) return false;
        return true;
    }


   /* public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (arr[c - 'a'] < 0) return false;
            else arr[c - 'a']--;
        }
        for (int i : arr) {
            if (i != 0) return false;
        }
        return true;
    }                      */
}
