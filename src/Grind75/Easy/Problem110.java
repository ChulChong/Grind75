package Grind75.Easy;

import Grind75.TreeNode;

public class Problem110 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {

        return getHeight(root) != -1;
    }

    private static int getHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = getHeight(node.left);
        if (leftHeight == -1) return -1;
        int rightHeight = getHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
