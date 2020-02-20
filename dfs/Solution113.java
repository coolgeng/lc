package day10;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;
/**
 * Solution113
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]
 */
public class Solution113 {
    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        

        return result;
    }

    public boolean helper(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            if (root.val - sum ==0) {

            }   
        }
        return helper(root.left, root.val - sum) ||         
    }

}