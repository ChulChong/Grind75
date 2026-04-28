package Grind75.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class Problem1091 {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid[0].length - 1][grid.length - 1] == 1) return -1;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        grid[0][0] = 1;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            if (current[0] == grid[0].length - 1 && current[1] == grid.length - 1) {
                return grid[current[0]][current[1]];
            }
            for (int[] dir : dirs) {
                int nr = current[0] + dir[0];
                int nc = current[1] + dir[1];
                if (nr < 0 || nr >= grid.length || nc < 0 || nc >= grid[0].length || grid[nr][nc] != 0) {
                    continue;
                }
                grid[nr][nc] = grid[current[0]][current[1]] + 1;
                queue.add(new int[]{nr, nc});
            }
        }
        return -1;
    }
}
