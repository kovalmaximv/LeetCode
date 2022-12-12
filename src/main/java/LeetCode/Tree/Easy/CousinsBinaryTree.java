package LeetCode.Tree.Easy;

// https://leetcode.com/problems/cousins-in-binary-tree/description/

public class CousinsBinaryTree {
    private int xDepth, yDepth;
    private int xParent, yParent;
    private int searchedX, searchedY;

    public boolean isCousins(TreeNode root, int x, int y) {
        searchedX = x;
        searchedY = y;
        depthRun(root, null, 0);

        return xDepth == yDepth && xParent != yParent;
    }

    private void depthRun(TreeNode node, TreeNode father, int lvl) {
        if (father != null) {
            if (node.val == searchedX) {
                xDepth = lvl;
                xParent = father.val;
            } else if (node.val == searchedY) {
                yDepth = lvl;
                yParent = father.val;
            }
        }


        if (node.left != null) {
            depthRun(node.left, node, lvl + 1);
        }
        if (node.right != null) {
            depthRun(node.right, node, lvl + 1);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
