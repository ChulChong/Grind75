package Grind75.Review;

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
        int leftheight = getHeight(node.left);
        if (leftheight == -1) return -1;
        int rightheight = getHeight(node.right);
        if (rightheight == -1) return -1;
        if (Math.abs(leftheight - rightheight) > 1) return -1;

        return Math.max(leftheight, rightheight) + 1;
    }
}
