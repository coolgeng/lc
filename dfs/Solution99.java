package dfs;

import common.TreeNode;
/**
 * Solution99
 * 
 * Two elements of a binary search tree (BST) are swapped by mistake.

Recover the tree without changing its structure.

Example 1:

Input: [1,3,null,null,2]

   1
  /
 3
  \
   2

Output: [3,1,null,null,2]

   3
  /
 1
  \
   2
Example 2:

Input: [3,1,4,null,null,2]

  3
 / \
1   4
   /
  2

Output: [2,1,4,null,null,3]

  2
 / \
1   4
   /
  3
Follow up:

A solution using O(n) space is pretty straight forward.
Could you devise a constant space solution?

 */
public class Solution99 {
   public void recoverTree(TreeNode root) {
      if (root== null) {
          return;
      }
      TreeNode largest = findLargest(root.left, root);
      TreeNode smallest = findSmallest(root.right, root);       
      if (largest.val > smallest.val) {  //two anomalies are found
          swap(largest, smallest);
      } else if (smallest.val < root.val) { //root is one of the swapped elements
          swap(root, smallest);
      } else if (largest.val > root.val) {  //root is one of the swapped elements
          swap(largest, root); 
      } else {  // swap has happened in one of the subtrees
          recoverTree(root.left);
          recoverTree(root.right);
      }
  }
  

      
  TreeNode findLargest(TreeNode root, TreeNode max) {
      if (root==null) return max;
      if (root.val > max.val) {
          max = root;
      } 
      TreeNode left = findLargest(root.left, max);
      if (left.val > max.val) {
          max = left;
      }
      TreeNode right = findLargest(root.right, max);
      if (right.val > max.val) {
          max = right;
      }
      return max;
  }
  
  TreeNode findSmallest(TreeNode root, TreeNode min) {
      if (root==null) return min;
      if (root.val < min.val) {
          min = root;
      }
      TreeNode left = findSmallest(root.left, min);
      if (left.val < min.val) {
          min = left;
      }
      TreeNode right = findSmallest(root.right, min);
      if (right.val < min.val) {
          min = right;
      }
      return min;
  }
  
  void swap(TreeNode a, TreeNode b) {
      int temp  = a.val;
      a.val = b.val;
      b.val = temp;
  }
}