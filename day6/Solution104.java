package day6;

import common.TreeNode;
/**
 * Solution104
 */
public class Solution104 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;        
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}