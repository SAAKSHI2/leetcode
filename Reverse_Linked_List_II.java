class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode r=head;
        int c=1;
        ArrayList<Integer> x=new ArrayList<>();
        while(c<=right)
        {
            if(c>=left)
                x.add(r.val);
            r=r.next;
            c++;
        }
        c=1;
        r=head;
        int z=x.size()-1;
        while(c<=right)
        {
         if(c>=left)
         {
             r.val=x.get(z);z--;
         }
            c++;
            r=r.next;
        }
        return head;
    }
}