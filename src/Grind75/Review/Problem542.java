package Grind75.Review;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Problem542 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }

    public static int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] j = queue.poll();
            for (int[] dir : dirs) {
                int nr = j[0] + dir[0];
                int nc = j[1] + dir[1];
                if (nr < 0 || nr >= mat.length || nc < 0 || nc >= mat[0].length || mat[nr][nc] != -1) continue;
                else {
                    mat[nr][nc] = mat[j[0]][j[1]] + 1;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
        return mat;
    }


}
