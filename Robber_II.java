class Solution {
    int func(int[] nums,int i,int dp[],int e)
    {
        if(i>=e)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        return dp[i]=Math.max(func(nums,i+2,dp,e)+nums[i],func(nums,i+1,dp,e));
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        if(nums.length==1)
            return nums[0];
            for(int i=0;i<nums.length;i++)
                dp[i]=-1;
        int y=func(nums,1,dp,nums.length);
        for(int i=0;i<nums.length;i++)
                dp[i]=-1;
        int x=func(nums,0,dp,nums.length-1);
        return Math.max(y,x);
    }
}