package Grind75.Easy;

import Grind75.TreeNode;

public class Problem543 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        System.out.println(diameterOfBinaryTree(root));
    }

    private static int maxDiameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        helper(root);
        return maxDiameter;
    }

    private static int helper(TreeNode root) {
        if (root == null) return 0;
        int leftSide = helper(root.left);
        int rightSide = helper(root.right);
        maxDiameter = Math.max(maxDiameter, leftSide + rightSide);
        return Math.max(leftSide, rightSide) + 1;
    }
}
