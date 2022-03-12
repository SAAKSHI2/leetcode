/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        
//     using HashMap (space complexity=O(n) && Time complexity=O(n))
       Node n=null,x=n,l=head;
//         HashMap<Node,Node> m=new HashMap<>();
//         while(l!=null)
//         {
//            n=new Node(l.val);
//             if(x!=null)
//              x.next=n;
//              m.put(l,n);
//             x=n;
             
//            l=l.next;
//         }
//         x.next=null;
//         Node y=m.get(head);
//         l=head;
//         while(l!=null)
//         {
//             if(l.random!=null)
//              y.random=(m.get(l.random));
//             else
//                 y.random=null;
//             y=y.next;
//             l=l.next;
//         }
//            return m.get(head);
        while(l!=null)
        {
          n=new Node(l.val);
            x=l.next;
            l.next=n;
            n.next=x;
            l=n.next;
        }
        l=head;
        while(l!=null)
        {
            if(l.random!=null)
            {
                l.next.random=l.random.next;
            }
            l=l.next.next;
        }
        l=head;
         n=null;
        x=l.next;
       
        while(l!=null)
        {
            n=l.next;
            l.next=l.next.next;
             if(l.next==null)
                break;
            n.next=l.next.next;
           
            l=l.next;
        }
        n.next=null;
        return x;
     
    }
}