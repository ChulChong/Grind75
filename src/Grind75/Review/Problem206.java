package Grind75.Review;

import Grind75.ListNode;

public class Problem206 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode.printNode(reverseList(head));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode right = curr.next;
            curr.next = prev;
            prev = curr;
            curr = right;
        }

        return prev;
    }
}
