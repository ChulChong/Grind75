package Grind75.Medium;

import Grind75.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem103 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Problem103 zigzag = new Problem103();
        System.out.println(zigzag.zigzagLevelOrder(root));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean leftToRight = true;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelOrder = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < levelOrder; i++) {
                TreeNode node = queue.poll();
                if (leftToRight) list.addLast(node.val);
                else list.addFirst(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            leftToRight = !leftToRight;
            ans.add(list);
        }
        return ans;
    }
}
