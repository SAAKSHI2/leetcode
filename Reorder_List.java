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
    public void reorderList(ListNode head) {
        List<Integer> x=new ArrayList<>();
        ListNode h=head;
        int c=0;
        while(h!=null)
        {
            c++;
            x.add(h.val);
            h=h.next;
        }
        if(c<=2)
            return;
         int v=c;
        h=head;
        c=c/2;
       
        int i=2,in=1;
        while(c>0)
        {
            if(i%2==0)
            {
            ListNode z=new ListNode();
            z.val=x.get(x.size()-in);
                in++;
            z.next=h.next;
            h.next=z;
            c--;
            }
            h=h.next;
            i++;
        }
        if(v%2==0)
            h.next=null;
        else
            h.next.next=null;
    }
}