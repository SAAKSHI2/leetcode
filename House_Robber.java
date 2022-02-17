class Solution {
    int func(int nums[],int ind,int dp[])
    {
        if(ind>nums.length-1)
            return 0;
        if(dp[ind]!=-1)
            return dp[ind];
        return dp[ind]=Math.max(func(nums,ind+2,dp)+nums[ind],func(nums,ind+1,dp));
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            dp[i]=-1;
        return func(nums,0,dp);
    }
}