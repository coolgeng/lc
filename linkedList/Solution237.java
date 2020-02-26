package linkedList;

import common.ListNode;
/**
 * Solution237
 */
public class Solution237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}