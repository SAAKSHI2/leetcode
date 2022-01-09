class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        if(l1==null)
            return l2;
       if(l2==null)
            return l1;
        ListNode l;
        if(l1.val<l2.val)
          l=l1;
        else
        {
            l=l2;
            l2=l1;
            l1=l;
            l=l1;
        }
        
       while(l2!=null && l1.next!=null)
       {
           if(l2.val==l1.val || l1.next.val>l2.val)
           {
               ListNode x=new ListNode(l2.val);
               ListNode y=l1.next;
               l1.next=x;
               x.next=y;
                l2=l2.next;
           }
           l1=l1.next;
          
       }
        while(l2!=null)
        {
             ListNode x=new ListNode(l2.val);
            l1.next=x;
            l1=l1.next;
            l2=l2.next;
        }  
     return l;
       
}
}