package Grind75.Medium;

import Grind75.TreeNode;

public class Problem235 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);

        TreeNode result = lowestCommonAncestor(root, p, q);
        System.out.println(result.val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root.val > p.val && root.val > q.val) {
            root = root.left;
        } else if (root.val < p.val && root.val < q.val) {
            root = root.right;
        } else {
            return root;
        }
        return lowestCommonAncestor(root, p, q);
    }
}
