package day5;


import common.TreeNode;

/**
 * Solution101
 */
public class Solution101 {    

    /**
     * Recursive solution
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;          
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }                
        return (left.val == right.val) && helper(left.left, right.right) && helper(left.right, right.left);
    }
    
    /**
     * Non-Recursive solution
     */
    

}