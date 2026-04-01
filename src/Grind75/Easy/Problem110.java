package Grind75.Easy;

import Grind75.TreeNode;

public class Problem110 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (root.left != null && root.right != null) {

        }
        return false;
    }
}
