package Grind75;

import java.util.LinkedList;
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
    public void printTree() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this);

        while (!queue.isEmpty()) {
            int size = queue.size();


            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node == null) {
                    System.out.print("null ");
                    continue;
                }

                System.out.print(node.val + " ");
                queue.offer(node.left);
                queue.offer(node.right);
            }
            System.out.println();
        }
    }
}