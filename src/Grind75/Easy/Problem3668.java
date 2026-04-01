package Grind75.Easy;

import java.util.*;

public class Problem3668 {
    public static void main(String[] args) {
        int[] order = {3, 1, 2, 5, 4};
        int[] friends = {1, 3, 4};
        System.out.println(Arrays.toString(recoverOrder(order, friends)));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> hs = new HashSet<>();
        for (int f : friends) {
            hs.add(f);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int person : order) {
            if (hs.contains(person)) {
                resultList.add(person);

            }
        }

        int[] ans = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            ans[i] = resultList.get(i);
        }

        return ans;
    }
}
