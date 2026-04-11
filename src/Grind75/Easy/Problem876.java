package Grind75.Easy;

import Grind75.ListNode;

public class Problem876 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode.printNode(middleNode(head));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /*public static ListNode middleNode(ListNode head) {
        int left = 0;
        int right = 0;
        int mid = 0;
        ListNode tmp = head;
        while (head != null) {
            right += 1;
            head = head.next;
        }
        mid = left + (right - left) / 2;
        while (0 < mid) {
            tmp = tmp.next;
            mid--;
        }

        return tmp;
    }*/
}
