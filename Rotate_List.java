class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        int c=1;
        ListNode h=head;
        h=head;
        while(h.next!=null)
        {
            c++;
            h=h.next;
        }
        ListNode b=h;
        k=k%c;
        h=head;
        c=c-k-1;
        while(c>0)
        {
            c--;
            h=h.next;    
        }
        b.next=head;
        head=h.next;
        h.next=null;
        return head;
    }
}