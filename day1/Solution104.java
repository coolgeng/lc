package day1;
import common.TreeNode;

class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
        }        
    }

}