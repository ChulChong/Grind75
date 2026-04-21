package Grind75.Medium;

public class Problem200 {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, int nc, int nr) {
        if (nc < 0 || nc >= grid.length || nr < 0 || nr >= grid[0].length) return;
        if (grid[nc][nr] == '0') return;
        grid[nc][nr] = '0';
        dfs(grid, nc + 1, nr);
        dfs(grid, nc - 1, nr);
        dfs(grid, nc, nr + 1);
        dfs(grid, nc, nr - 1);
    }
}
