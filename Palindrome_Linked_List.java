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
    public boolean isPalindrome(ListNode head) {
        ListNode t=new ListNode(head.val),x=null,p=t,y=head;
       head=head.next;
        while(head!=null)
        {
            x=new ListNode(head.val);
            x.next=t;
            t=x;
            head=head.next;
        }
        while(t!=null)
        {
            if(t.val!=y.val)
                return false;
            t=t.next;
            y=y.next;
        }
        return true;
    }
}