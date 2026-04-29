package Grind75.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class Problem994 {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        if (freshCount == 0) return 0;
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int minutes = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int[] dir : dirs) {
                int nr = current[0] + dir[0];
                int nc = current[1] + dir[1];
                if (nr < 0 || nr >= grid.length || nc < 0 || nc >= grid[0].length || grid[nr][nc] != 1) {
                    continue;

                }
                grid[nr][nc] = grid[current[0]][current[1]] + 1;
                minutes = Math.max(minutes, grid[nr][nc] - 2);
                queue.add(new int[]{nr, nc});
                freshCount--;
            }
        }
        return freshCount == 0 ? minutes : -1;
    }
}
