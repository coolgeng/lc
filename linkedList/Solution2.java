package linkedList;

import common.ListNode;

/**
 * Solution2
 * 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.


 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        ListNode tail = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode current = new ListNode(0);
            int val1 = 0;
            int val2 = 0;
            if (l1!=null) {
                val1 = l1.val;
            }
            if (l2!=null) {
                val2 = l2.val;
            }
            int sum = val1 + val2 + carry;
            current.val = sum % 10;
            carry = sum / 10;
            prev.next = current;
            prev = current;
            if (l1 !=null) {
                l1 = l1.next;
            }
            if (l2 !=null) {
                l2 = l2.next;
            }
        }

        return head.next;
    }
}