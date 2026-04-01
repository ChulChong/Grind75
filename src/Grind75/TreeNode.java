package Grind75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    //Print by BFS
    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (curr != null) {
                result.add(String.valueOf(curr.val));
                queue.add(curr.left);
                queue.add(curr.right);
            } else {
                result.add("null");
            }
        }

        while (!result.isEmpty() && result.get(result.size() - 1).equals("null")) {
            result.remove(result.size() - 1);
        }

        System.out.println(result);
    }
}