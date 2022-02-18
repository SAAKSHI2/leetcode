class Solution {
   int func(int[][] a,int i,int j,int[][] dp)
   {
       if(j<0|| j>a.length-1)return Integer.MAX_VALUE;
       if(i==a.length-1) return a[i][j];
       if(dp[i][j]!=-1)
           return dp[i][j];
       return dp[i][j]=Math.min(func(a,i+1,j,dp),Math.min(func(a,i+1,j+1,dp),func(a,i+1,j-1,dp)))+a[i][j];
       
   }
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
        int dp[][]=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
                dp[i][j]=-1;
        }
        for(int i=0;i<matrix.length;i++)
        {
            ans=Math.min(func(matrix,0,i,dp),ans);
        }
        return ans;
    }
}