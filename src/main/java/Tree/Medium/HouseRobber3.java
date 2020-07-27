package Tree.Medium;

// https://leetcode.com/problems/house-robber-iii/
// Medium
// Problem: 3

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

public class HouseRobber3 {
    /*
    public int rob(TreeNode root) {
        int[] dec = robe(root);
        return Math.max(dec[0], dec[1]);
    }

    private int[] robe(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = robe(root.left);
        int[] right = robe(root.right);

        int rob = root.val + left[1] + right[1];
        int dontRob = Math.max(left[1], left[0]) + Math.max(right[1], right[0]);

        return new int[]{rob, dontRob};
    }
     */
}
