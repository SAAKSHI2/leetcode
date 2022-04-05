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
    public void path(List<List<Integer>> l,List<Integer> x,int targetSum,TreeNode root)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null && targetSum-root.val==0)
        {
            x.add(root.val);
            l.add(new ArrayList<Integer>(x));
            x.remove(x.size()-1);
            return;
        }
        x.add(root.val);
        path(l,x,targetSum-root.val,root.left);
        path(l,x,targetSum-root.val,root.right);
            x.remove(x.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> l=new ArrayList<>();
        path(l,new ArrayList<Integer>(),targetSum,root);
        return l;
    }
}