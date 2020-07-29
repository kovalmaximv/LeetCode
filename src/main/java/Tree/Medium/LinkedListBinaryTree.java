package Tree.Medium;

// https://leetcode.com/problems/linked-list-in-binary-tree/
// Medium
// Problem: 1

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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class LinkedListBinaryTree {
    /*
    public boolean isSubPath(ListNode head, TreeNode root) {
        return generate(root, head);
    }

    private boolean generate(TreeNode root, ListNode head) {
        if (root == null) {
            return false;
        }

        if (root.val == head.val) {
            if(checkBranch(root, head)) {
                return true;
            }
        }
        return generate(root.left, head) || generate(root.right, head);
    }

    private boolean checkBranch(TreeNode root, ListNode node) {
        if (node == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.val != node.val) {
            return false;
        }
        return
            checkBranch(root.left, node.next) || checkBranch(root.right, node.next);
    }
     */
}
