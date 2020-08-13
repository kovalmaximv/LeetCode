package LeetCode.Tree.Easy;

// https://leetcode.com/problems/merge-two-binary-trees/
// Easy
// Problem: 0

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
public class MergeTwoBinaryTrees {
    /*
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode newNode = null;

        if (t1 != null || t2 != null) {
            newNode = new TreeNode();
            int val1 = t1 != null ? t1.val : 0;
            int val2 = t2 != null ? t2.val : 0;
            newNode.val = val1 + val2;

            newNode.left = mergeTrees(
                t1 != null ? t1.left : null,
                t2 != null ? t2.left : null
            );
            newNode.right = mergeTrees(
                t1 != null ? t1.right : null,
                t2 != null ? t2.right : null
            );
        }

        return newNode;
    }
     */
}
