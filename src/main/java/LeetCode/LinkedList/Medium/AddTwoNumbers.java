package LeetCode.LinkedList.Medium;

// https://leetcode.com/problems/add-two-numbers/
// Easy
// Problem: 1 (Correct myself after test falling)

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
public class AddTwoNumbers {
    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        ListNode prev = null;
        int rem = 0;
        while (l1 != null || l2 != null) {
            int nm1 = l1 != null ? l1.val : 0;
            int nm2 = l2 != null ? l2.val : 0;

            int nm = nm1 + nm2 + rem;
            rem = nm / 10;
            nm %= 10;

            ListNode node = new ListNode(nm);

            if (ans == null) {
                ans = node;
                prev = node;
            } else {
                prev.next = node;
                prev = prev.next;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (rem > 0) {
            ListNode node = new ListNode(rem);
            prev.next = node;
            prev = prev.next;
        }

        return ans;
    }
     */
}
