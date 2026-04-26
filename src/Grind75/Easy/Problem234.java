package Grind75.Easy;

import Grind75.ListNode;

public class Problem234 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode.printNode(head);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        while (head != null && prev != null) {
            if (head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}
