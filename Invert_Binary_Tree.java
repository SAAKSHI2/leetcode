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
    public void func(TreeNode root)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            return;
       if(root.left==null && root.right!=null)
        {
            root.left=root.right;
            root.right=null;
            func(root.left);
        }
        else if(root.left!=null && root.right==null)
        {
            root.right=root.left;
            root.left=null;
            func(root.right);
        }
        else
        {
           TreeNode t=root.left;
            root.left=root.right;
            root.right=t;
            func(root.left);
            func(root.right);
        }
    }
    public TreeNode invertTree(TreeNode root) {
        func(root);
        return root;
    }
}