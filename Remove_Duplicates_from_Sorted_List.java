class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode b=head;
        while(b.next!=null)
        {
            if(b.val==b.next.val)
                b.next=b.next.next;
            else
                b=b.next;
        }
        return head;
    }
}