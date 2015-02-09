package leetcode.easy;

import java.util.List;

/**
 * Created by Jane on 2/9/15.
 */
public class RemoveNthFromEnd {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode r1 = head;
        ListNode r2 = head;
        int count = 0;

        while (count < n) {
            r1 = r1.next;
            count++;
        }
        if (r1 == null) return head.next;
//        System.out.println("initial running: r1 is " + r1.val);

        while (r1.next != null) {
            r1 = r1.next;
            r2 = r2.next;
        }
//        System.out.println("found end: r1 is " + r1.val + " r2 is " + r2.val);

        r2.next = r2.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode pre = head;
        for (int i = 1; i <= 5; i++) {
            ListNode node = new ListNode(i);
            pre.next = node;
            pre = node;
        }
        printList(head);

        ListNode newHead = removeNthFromEnd(head, 6);
        System.out.println("after removal: ");
        printList(newHead);
    }

    public static void printList(ListNode head) {
        ListNode n = head;
        while (n != null) {
            System.out.print(n.val + " --> ");
            n = n.next;
        }
    }
}
