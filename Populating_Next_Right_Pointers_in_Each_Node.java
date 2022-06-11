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
        q.add(root);
        while(q.size()>0)
        {
            int s=q.size();
            while(s>0)
            {
                Node root1=q.poll();
                if(q.size()>0)
                root1.next=q.peek();
               if(root1.left!=null)
                   q.add(root1.left);
               
                if(root1.right!=null)
                   q.add(root1.right);
                
                s--;
                if(s==0)
                    root1.next=null;
                
            }
            
        }
        return root;
    }
}