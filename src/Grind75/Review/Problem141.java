package Grind75.Review;

import Grind75.ListNode;

public class Problem141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
        int pos = 1;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    /*public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        while(head.next != null){
            hs.add(head);
            head = head.next;
            if(hs.contains(head.next)){
                return true;
            }
        }

        return false;
    }*/

}
