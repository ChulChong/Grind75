package Grind75.Easy;

import Grind75.TreeNode;
import com.sun.source.tree.Tree;

public class Problem226 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1),
                new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        invertTree(root).printTree();

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
