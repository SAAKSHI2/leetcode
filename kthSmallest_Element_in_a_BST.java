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
    int x,r=0;
    public void ino(TreeNode root,int k,ArrayList<Integer> a)
    {
        if(root!=null)
        {
        ino(root.left,k,a);
        a.add(root.val);
       ino(root.right,k,a);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
if(root!=null){
        kthSmallest(root.left,k);
    r++;
    if(k==r)
    {
       x=root.val;
        return x;
    }
    kthSmallest(root.right,k);
}
        return x;
        // ArrayList<Integer> a=new ArrayList<>();
        // ino(root,k,a);
        // return a.get(k-1);
    }
}