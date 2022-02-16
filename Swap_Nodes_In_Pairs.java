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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode l=head,h=head,p=null;
        head=head.next;
        int i=0;
        while(l.next!=null)
        {
             h=l.next;
            l.next=l.next.next;
            h.next=l;
            if(i!=0)
            p.next=h;
            i++;
            if(l.next==null)
                return head;
             p=l;
            l=l.next;
            
        }
        return head;
    }
}