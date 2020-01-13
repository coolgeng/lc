package day8;

import common.TreeNode;
import common.ListNode;

/**
 * Solution109
 */
public class Solution109 {
    public ListNode node;

    public TreeNode sortedListToBST(ListNode head) {
        if (head ==null) return null;
        node = head;
        int size = 0;
        while (head.next != null) {
            size ++;
        }
        return helper(head, 0, size -1);
    }
    
    public TreeNode helper(TreeNode head, int low, int high) {
        if (low > high) return null;

        TreeNode left = helper(head, low, high);
        TreeNode treenode = new TreeNode();
        TreeNode node = new TreeNode(node.val);

        return treenode;
    }
}