package day7;

import java.util.HashMap;
import java.util.Map;

import common.TreeNode;

/**
 * Solution106
 */
public class Solution106 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inMap = new HashMap();
        for (int i = 0; i < postorder.length; i++) {
            inMap.put(postorder[i], i);
        }
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inMap);
    }

    private TreeNode helper(int[] inorder, int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd, Map inMap) {
        if (inorderStart < inorderEnd || postorderStart < postorderEnd) return null;        

        TreeNode root = new TreeNode(postorder[postorderEnd]);
        root.left = helper(inorder, inorderStart, inorderEnd, postorder, postorderStart, postorderEnd, inMap);
        root.right = helper(inorder, inorderStart, inorderEnd, postorder, postorderStart, postorderEnd, inMap);
        return root;
    }
    
}