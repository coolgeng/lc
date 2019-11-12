package day2;
import common.TreeNode;

/**
 * Solution108
 */
public class Solution108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;        
        TreeNode root = helper(nums, 0, nums.length - 1);        
        return root;
    }

    private TreeNode helper(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = helper(nums, low, mid - 1);
        head.right = helper(nums, mid + 1, high);
        return head;
    }
}