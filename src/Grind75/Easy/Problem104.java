package Grind75.Easy;

import Grind75.TreeNode;

public class Problem104 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode.printTree(root);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        return helper(root);
    }

    private static int helper(TreeNode root) {
        if (root == null) return 0;
        int leftSide = helper(root.left);
        int rightSide = helper(root.right);

        return Math.max(leftSide, rightSide) + 1;
    }
}
