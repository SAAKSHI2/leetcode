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
   public void inorder(ArrayList<Integer> a,TreeNode root)
   {
       if(root!=null)
       {
           inorder(a,root.left);
           a.add(root.val);
           inorder(a,root.right);
       }
   }
  public boolean validate(TreeNode root,long max,long min)
  {
      if(root==null)return true;
      if(root.val<=min || root.val>=max)return false;
      return validate(root.left,root.val,min)&&validate(root.right,max,root.val);
      
  }
    TreeNode p=null;
    public boolean isValidBST(TreeNode root) {
       // ArrayList<Integer> a=new ArrayList<>();
       //  inorder(a,root);
       //  for(int i=0;i<a.size()-1;i++)
       //  {
       //      if(a.get(i+1)<=a.get(i))
       //          return false;
       //  }
//         if(root!=null)
//         {
//             if(!isValidBST(root.left))return false;
//             if(p!=null && root.val<=p.val)
//                 return false;
//            p=root;
//             return isValidBST(root.right);
            
//         }
//         return true;
        
        return validate(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
}