package linkedList;

import common.ListNode;

/**
 * Solution206
 */
public class Solution206 {

    /**
     * 
     * 
     * 
     * Much easier, intuitive recursive method and concise code:
Key: reverse remaining linked list headed at head.next first, then operate on head

initial:
1 -> 2 -> 3 -> 4 -> 5

after reverseList(2):
1 -> 2 <- 3 <- 4 <- 5
     |
     v
    null
	
after operate on 1:
null <- 1 <- 2 <- 3 <- 4 <- 5

     * @param head
     * @return
     */
    // public ListNode reverseList(ListNode head) {
    //     // base case
    //     if(head == null || head.next == null) return head;
        
    //     ListNode newHead = reverseList(head.next);
        
    //     head.next.next = head;
    //     head.next = null;

    //     return newHead;
    // }

    public ListNode reverseList(ListNode head) {
        /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    
    public ListNode reverseList(ListNode head) {
        /* recursive solution */
        return reverseListInt(head, null);
    }
    
    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
}