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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int c=1;
        q.add(root);
     //   ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        boolean flag=false;
        while(q.size()!=0)
        {
           // a.add(new ArrayList<Integer>());
            c=q.size();
            int p=Integer.MIN_VALUE;
            if(c==1 && flag==false)
            {
                if((q.peek()).val%2==0)
                    return false;
            }
            else if(c==1 && flag==true)
            {
                if((q.peek()).val%2!=0)
                    return false;
            }
                     
            for(int i=0;i<c;i++)
            {
                TreeNode t=q.poll();
              //  a.get(a.size()-1).add(t.val);
                if(p==Integer.MIN_VALUE)
                  p=t.val;
                 
                else if(flag==true && p>t.val && t.val%2==0)
                 p=t.val;
                 
                else if(flag==false && p<t.val && t.val%2!=0)
                   p=t.val;
                
                else
                    return false;
                if(t.left!=null)
                {
                    q.add(t.left);
                }
                if(t.right!=null)
                {
                q.add(t.right);
                }
            }
            flag=!flag;
           // System.out.println(flag);
        }
    //System.out.println(a);
//         if(root.val%2==0)
//             return false;
//         for(int i=1;i<a.size();i++)
//         {
//             if((i+1)%2==0)
//             {
//                   if(a.get(i).size()==1)
//                 {
//                     if(a.get(i).get(0)%2!=0)
//                         return false;
//                     else
//                         continue;
//                 }
//             for(int j=0;j<a.get(i).size()-1;j++)
//             {
//                 if(a.get(i).get(j)>a.get(i).get(j+1) && a.get(i).get(j)%2==0 && a.get(i).get(j+1)%2==0)
//                 {
//                     continue;
//                 }
//                 else
//                     return false;
//             }
//             }
//             else
//             {
                
//                 if(a.get(i).size()==1)
//                 {
//                     if(a.get(i).get(0)%2==0)
//                         return false;
//                     else
//                         continue;
//                 }
//             for(int j=0;j<a.get(i).size()-1;j++)
//             {
//                 if(a.get(i).get(j)<a.get(i).get(j+1) && a.get(i).get(j)%2!=0 && a.get(i).get(j+1)%2!=0)
//                 {
//                     continue;
//                 }
//                 else
//                     return false;
//             }
//             }
//         }
        return true;
        
    }
}