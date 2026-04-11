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

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }

        // 1. 최상단 루트 노드는 뼈대 없이 바로 출력!
        System.out.println(root.val);

        // 2. 자식 노드가 있다면 본격적인 뼈대 그리기 작전 시작!
        if (root.left != null || root.right != null) {
            printNode(root.left, "", root.right == null);
            printNode(root.right, "", true);
        }
    }

    private static void printNode(TreeNode node, String prefix, boolean isTail) {
        if (node == null) return;

        // 현재 노드의 뼈대와 값을 출력!
        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.val);

        // 자식 노드가 하나라도 존재하면 다음 레벨로 전진!
        if (node.left != null || node.right != null) {
            String nextPrefix = prefix + (isTail ? "    " : "│   ");
            printNode(node.left, nextPrefix, node.right == null);
            printNode(node.right, nextPrefix, true);
        }
    }
}