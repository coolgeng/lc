package linkedList;

import common.ListNode;

/**
 * Solution141
 */
public class Solution141 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;        
        while (fast != null && slow != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}