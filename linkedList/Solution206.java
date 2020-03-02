package linkedList;

import common.ListNode;

/**
 * Solution206
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode preHead = new ListNode(0);
        while (head != null) {
            ListNode tmp = preHead.next;
            preHead.next = head;
            head = head.next;
            preHead.next.next = tmp;
        }
        
        return preHead.next;
    }

}