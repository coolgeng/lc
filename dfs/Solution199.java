package dfs;

import java.util.ArrayList;
import java.util.List;
import common.TreeNode;
/**
 * Solution199 Given a binary tree, imagine yourself standing on the right side
 * of it, return the values of the nodes you can see ordered from top to bottom.
 * 
 * Example:
 * 
 * Input: [1,2,3,null,5,null,4] Output: [1, 3, 4] Explanation:
 * 
 * 1 <--- / \ 2 3 <--- \ \ 5 4 <---
 * 
 */
public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        helper(root, output, 0);
        return output;
    }

    void helper(TreeNode root, List<Integer> output, int level) {
        if (root == null) return;
        if (output.size() < level + 1) {output.add(root.val);}
        helper(root.right, output, level + 1);
        helper(root.left, output,  level + 1);        
    }
}