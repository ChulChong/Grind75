package Grind75.Medium;

public class Problem2182 {
    public static void main(String[] args) {
        String s = "cczazcc";
        int repeatLimit = 3;
        System.out.println(repeatLimitedString(s, repeatLimit));
    }

    public static String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) continue;
            int j = i - 1;
            while (j >= 0 && arr[j] == 0) j--;

            while (arr[i] > 0) {
                int repeat = Math.min(arr[i], repeatLimit);
                for (int k = 0; k < repeat; k++) {
                    sb.append((char) ('a' + i));
                    arr[i]--;
                }
                if (arr[i] == 0) break;
                if (j < 0) break;
                sb.append((char) ('a' + j));
                arr[j]--;
                while (j >= 0 && arr[j] == 0) j--;
            }
        }
        return sb.toString();
    }
}
