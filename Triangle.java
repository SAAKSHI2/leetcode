class Solution {
    int func(List<List<Integer>> a,int i,int j,int[][] dp)
    {
        if(i==a.size()-1)
            return a.get(i).get(j);
        if(dp[i][j]!=-1)
            return dp[i][j];
        return dp[i][j]=Math.min(func(a,i+1,j,dp),func(a,i+1,j+1,dp))+a.get(i).get(j);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][]=new int[triangle.size()][triangle.size()];
        for(int i=0;i<triangle.size();i++)
        {
            for(int j=0;j<triangle.size();j++)
            dp[i][j]=-1;
        }
        return func(triangle,0,0,dp);
    }
}