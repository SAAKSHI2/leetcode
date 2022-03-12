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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=l1.val+l2.val;
        ListNode x=new ListNode((c%10));
        ListNode q=x;
        c=c/10;
        l1=l1.next;
        l2=l2.next;
        while(l1!=null && l2!=null)
        {
             int z=(c+l1.val+l2.val);
            ListNode y=new ListNode(z%10);
            c=z/10;
            x.next=y;
            x=y; 
            l1=l1.next;
            l2=l2.next;
        }
        while(l2!=null)
        {
            int z=(c+l2.val);
            ListNode y=new ListNode(z%10);
            c=z/10;
            x.next=y;
            x=y;
            l2=l2.next;
        }
         while(l1!=null)
        {
            int z=(c+l1.val);
            ListNode y=new ListNode(z%10);
            c=z/10;
            x.next=y;
            x=y;
            l1=l1.next;
        }
        if(c!=0)
           x.next=new ListNode(c); 
        return q;
    }
}