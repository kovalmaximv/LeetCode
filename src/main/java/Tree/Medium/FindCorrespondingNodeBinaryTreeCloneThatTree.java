package Tree.Medium;

// https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
// Medium
// Problem: 1

public class FindCorrespondingNodeBinaryTreeCloneThatTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    /*
    class Solution {
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if (original == target) {
                return cloned;
            }
            if (original == null) {
                return null;
            }

            TreeNode left = getTargetCopy(original.left, cloned.left, target);
            if (left != null) {
                return left;
            } else {
                return getTargetCopy(original.right, cloned.right, target);
            }

        }
    }
     */
}
