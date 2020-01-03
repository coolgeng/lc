package day8;

import common.TreeNode;

/**
 * Solution108
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length ==0) return null;        
        return helper(nums, 0, nums.length - 1);
    }    

    public TreeNode helper(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) /2;
        TreeNode node = new TreeNode(mid);
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);
        return node;
    }
}