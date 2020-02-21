package dfs;

import common.TreeNode;

/**
 * Solution114
 * 
 * Given a binary tree, flatten it to a linked list in-place.

For example, given the following tree:

    1
   / \
  2   5
 / \   \
3   4   6

The flattened tree should look like:

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6


 */
public class Solution114 {

    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null)
        return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    // if (!root) return;
    //     if (root->left) flatten(root->left);
    //     if (root->right) flatten(root->right);
    //     TreeNode *tmp = root->right;
    //     root->right = root->left;
    //     root->left = NULL;
    //     while (root->right) root = root->right;
    //     root->right = tmp;
    // 这道题要求把二叉树展开成链表，根据展开后形成的链表的顺序分析出是使用先序遍历，那么只要是数的遍历就有递归和非递归的两种方法来求解，
    // 这里我们也用两种方法来求解。首先来看递归版本的，思路是先利用 DFS 的思路找到最左子节点，然后回到其父节点，把其父节点和右子节点断开，
    // 将原左子结点连上父节点的右子节点上，然后再把原右子节点连到新右子节点的右子节点上，然后再回到上一父节点做相同操作。代码如下：

}