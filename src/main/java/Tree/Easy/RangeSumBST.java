package Tree.Easy;

// https://leetcode.com/problems/range-sum-of-bst/
// Easy

public class RangeSumBST {
}

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
/*class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root.left == null && root.right == null) {
            if (root.val >= L && root.val <= R) {
                return root.val;
            }
            return 0;
        }
        int leftSum = 0, rightSum = 0;
        if (root.left != null) {
            leftSum = rangeSumBST(root.left, L, R);
        }
        if (root.right != null) {
            rightSum = rangeSumBST(root.right, L, R);
        }

        return leftSum + rightSum + ((root.val >= L && root.val <= R) ? root.val : 0);
    }
}*/
