public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode l=head,prev=head;
        while(l!=null &&l.next!=null)
        {
            prev=prev.next;
            l=l.next.next;
            if(l==prev)
                    return true;
        }
        return false;
    }
}