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
    public boolean has(TreeNode root,int targetSum)
    {
          if(targetSum==0 && root==null)
                 return true;
         if(root==null)
             return false;
                 
         if(root.left==null && root.right!=null)
            {
                return has(root.right,targetSum-root.val);
            }
            else if(root.left!=null && root.right==null)
            {
                return has(root.left,targetSum-root.val);
            }
            else
                return has(root.left,targetSum-root.val)||has(root.right,targetSum-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
           if(root==null)
               return false;
        return has(root,targetSum);
    }
}