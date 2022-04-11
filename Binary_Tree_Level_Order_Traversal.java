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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q=new LinkedList<>();
         q.add(root);
        while(q.size()>0)
        {
            int x=q.size();
            List<Integer> l=new ArrayList<Integer>();
            while(x>0)
            {
                TreeNode t=q.poll();
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
                
                l.add(t.val);
                x--;
            }
            ans.add(new ArrayList<Integer>(l));
        }
        return ans;
    }
}