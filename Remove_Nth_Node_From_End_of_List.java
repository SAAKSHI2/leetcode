class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
            return null;
        ListNode l=head;
        int c=1;
        while(l.next!=null)
        {
            c++;
            l=l.next;
        }
        if(c==n)
            return head.next;
        int x=1;
        l=head;
        while(x<c-n)
        {
            l=l.next;
            x++;
        }
        l.next=l.next.next;
        return head;
    }
}