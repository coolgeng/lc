package linkedList;

import common.ListNode;
/**
 * Solution23
 */
public class Solution23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return partition(lists, 0, lists.length -1);
    }

    private ListNode partition(ListNode[] lists, int s, int e) {
        if (s == e) return lists[s];
        if(s<e){
            int q=(s+e)/2;
            ListNode l1=partition(lists,s,q);
            ListNode l2=partition(lists,q+1,e);
            return merge(l1,l2);
        }
        return null;        
        
    }
    
    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = merge(l2, l1.next);
            return l1;
        } else {
            l2.next = merge(l1,l2.next);
            return l2;
        }        
    }

}