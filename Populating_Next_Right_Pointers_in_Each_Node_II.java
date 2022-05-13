/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> q=new LinkedList<>();
        Queue<Node> q2=new LinkedList<>();
        q.add(root);
        root.next=null;
        while(q.size()!=0)
        {
            int x=q.size();
            while(x>0){
            Node n=q.poll();
            if(n.left!=null)
            {
                q.add(n.left);
                q2.add(n.left);
            }
                if(n.right!=null)
                {
                    q.add(n.right);
                    q2.add(n.right);
                }
                x--;
            }
           
            while(q2.size()>0)
            {
                Node z=q2.poll();
                z.next=q2.peek();
            }
            
        }
        return root;
    }
}