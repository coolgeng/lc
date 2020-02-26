package linkedList;

import common.ListNode;
/**
 * Solution24
 */
public class Solution24 {   

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);        
        dummy.next = head;
        ListNode point = dummy;
        while (point.next!=null && point.next.next!=null) {
            ListNode first = point.next;
            ListNode second = point.next.next;
            point.next = second;            
            first.next = second.next;
            second.next = first;
            point = first;
        }
        return dummy.next;
    }
}