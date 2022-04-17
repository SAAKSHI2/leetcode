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
class Solution {
    TreeNode t=null,p=null;
    public void inorder(TreeNode t,TreeNode root,List<Integer> a)
    {
        
        if(root!=null)
        {
            inorder(t,root.left,a);
            a.add(root.val);
            inorder(t,root.right,a);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        
        // TreeNode t=new TreeNode();
        // List<Integer> a=new ArrayList<>();
        // inorder(t,root,a);
        // TreeNode x=new TreeNode(a.get(0));
        // t=x;
        // for(int i=1;i<a.size();i++)
        // {
        //    TreeNode y=new TreeNode(a.get(i));
        //     x.right=y;
        //     x=x.right;
        // }
        // return t;
        if(root!=null){
            increasingBST(root.left);
            if(t==null)
            {
                t=root;
                p=root;
            }else
            {
                p.right=new TreeNode(root.val);
                p=p.right;
            }
            increasingBST(root.right);
        }
        return t;
    }
}