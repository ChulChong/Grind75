package Grind75.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Problem242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
//  this code has O(nlogn)
    //    public static boolean isAnagram(String s, String t) {
//        char[] arr1 = s.toCharArray();
//        char[] arr2 = t.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        return Arrays.equals(arr1, arr2);
//    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) - 1);
        }
        for (int val : hm.values()) {
            if (val != 0) return false;
        }
        return true;
    }
     //this code has O(n)
}
