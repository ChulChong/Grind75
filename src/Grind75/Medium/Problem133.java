package Grind75.Medium;

import Grind75.Node;

import java.util.HashMap;

public class Problem133 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        Problem133 ans = new Problem133();
        System.out.println(ans.cloneGraph(node1).val);
    }

    HashMap<Node, Node> hm = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        if (hm.containsKey(node)) {
            return hm.get(node);
        }
        Node clone = new Node(node.val);
        hm.put(node, clone);
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}
