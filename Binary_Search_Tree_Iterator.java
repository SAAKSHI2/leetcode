/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
TreeNode t=null;
    ArrayList<Integer> a=new ArrayList<>();
    public void inorder(TreeNode root,ArrayList<Integer> a)
    {
        if(root!=null)
        {
            inorder(root.left,a);
            a.add(root.val);
            inorder(root.right,a);
        }
    }
    public BSTIterator(TreeNode root) {
        t=root;
       inorder(root,a);
    }
    
    public int next() {  
        int x=a.get(0);
        a.remove(0);
        return x;
    }
    
    public boolean hasNext() {
        if(a.size()!=0)
            return true;
        return false;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */