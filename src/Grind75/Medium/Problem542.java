package Grind75.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Problem542 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }

    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }
        int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] currPosition = queue.poll();
            int currentRow = currPosition[0];
            int currentColumn = currPosition[1];

            for (int[] dir : direction) {
                int newRow = currentRow + dir[0];
                int newColumn = currentColumn + dir[1];
                if (newColumn < 0 || newColumn >= n || newRow < 0 || newRow >= m || mat[newRow][newColumn] != -1) {
                    continue;
                }
                mat[newRow][newColumn] = mat[currentRow][currentColumn] + 1;
                queue.offer(new int[]{newRow, newColumn});
            }
        }
        return mat;
    }
}
