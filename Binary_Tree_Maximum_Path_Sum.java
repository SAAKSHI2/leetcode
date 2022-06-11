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
    int maxi=Integer.MIN_VALUE;
    public int max(TreeNode root)
    {
       if(root==null)
           return 0;
        int l=max(root.left);
        int r=max(root.right);
        maxi=Math.max((l+r+root.val),maxi);
        maxi=Math.max(Math.max(l,r)+root.val,maxi);
        maxi=Math.max(maxi,root.val);
        if(Math.max(l,r)+root.val<0)
            return 0;
        if(l<0&&r<0&&root.val<0)
            return 0;
        if(l<0 && r<0)
            return root.val;
        if(l<0)
            return root.val+r;
        if(r<0)
            return root.val+l;
        return Math.max(l,r)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        if(root==null)
            return 0;
        max(root);
        return maxi;
    }
}