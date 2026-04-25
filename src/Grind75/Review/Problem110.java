package Grind75.Review;

import Grind75.TreeNode;

public class Problem110 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode.printTree(root);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        return getHeight(root) == -1 ? false : true;
    }

    private static int getHeight(TreeNode node) {
        if (node == null) return 0;
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }
}
