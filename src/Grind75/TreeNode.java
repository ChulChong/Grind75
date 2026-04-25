package Grind75;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void printTree(TreeNode root) {
        int height = getHeight(root);
        int colWidth = 4; // 노드당 칸 너비 (필요시 조정)
        int width = ((1 << height) - 1) * colWidth;

        char[][] grid = new char[height * 2 - 1][width];
        for (char[] row : grid) Arrays.fill(row, ' ');

        fill(grid, root, 0, 0, width - 1, colWidth);

        for (char[] row : grid) {
            System.out.println(new String(row).replaceAll("\\s+$", ""));
        }
    }

    private static int getHeight(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    private static void fill(char[][] grid, TreeNode node, int row, int left, int right, int colWidth) {
        if (node == null) return;
        int mid = (left + right) / 2;
        String val = String.valueOf(node.val);
        int start = mid - val.length() / 2;
        for (int i = 0; i < val.length(); i++) grid[row][start + i] = val.charAt(i);

        if (node.left != null) {
            grid[row + 1][(left + mid) / 2] = '/';
            fill(grid, node.left, row + 2, left, mid - 1, colWidth);
        }
        if (node.right != null) {
            grid[row + 1][(mid + right) / 2] = '\\';
            fill(grid, node.right, row + 2, mid + 1, right, colWidth);
        }
    }

}