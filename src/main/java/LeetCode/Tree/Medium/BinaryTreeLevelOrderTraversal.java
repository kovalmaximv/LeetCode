package LeetCode.Tree.Medium;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
// Medium
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

public class BinaryTreeLevelOrderTraversal {
    /*
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root != null) {
            generate(res, 0, root);
        }

        return res;
    }

    private void generate(List<List<Integer>> res, int level, TreeNode node) {
        if (level >= res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        if (node.left != null) {
            generate(res, level + 1, node.left);
        }
        if (node.right != null) {
            generate(res, level + 1, node.right);
        }
    }
     */
}
