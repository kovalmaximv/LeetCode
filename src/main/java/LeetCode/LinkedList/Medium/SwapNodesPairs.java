package LeetCode.LinkedList.Medium;

// https://leetcode.com/problems/swap-nodes-in-pairs/
// Medium
// Problem: 0


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class SwapNodesPairs {
    /*
    public ListNode swapPairs(ListNode head) {
        ListNode cursor = head, prev = null;
        while (cursor != null && cursor.next != null) {
            ListNode nextNode = cursor.next;

            cursor.next = cursor.next.next;
            nextNode.next = cursor;

            if (prev == null) {
                head = nextNode;
            } else {
                prev.next = nextNode;
            }

            prev = cursor;
            cursor = cursor.next;
        }

        return head;
    }
     */
}
