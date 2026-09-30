/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode slow=head,fast=head;
        ListNode extraSlow=head;
        while(fast.next!=null){
            extraSlow=slow;
            slow=slow.next;
            if(fast.next.next!=null) 
                fast=fast.next.next;
            else
                break;
        }
        // now extra slow is one node prior to mid
        //while slow is mid
        //deletion happend here
        extraSlow.next= slow.next!=null? slow.next : null;
        return head;
    }
}