package day1;
import common.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root.left != null) {
            return maxDepth(root.left) + 1;
        } else if (root.right != null) {
            return maxDepth(root.right) + 1;
        } else {
            return 1;
        }        
    }

    public static void main(String[] args) {
        
    }

}