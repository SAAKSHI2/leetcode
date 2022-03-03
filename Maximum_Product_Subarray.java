class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==0)
            return 0;
        // int m=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++)
        // {
        //    int max=nums[i];
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         m=Math.max(m,max);
        //         max*=nums[j];
        //     }
        //      m=Math.max(m,max);
        // }
        // return m;
        
        //approach 2
        // int max=1,min=1,m=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     max*=nums[i];
        //    m=Math.max(m,max);
        //    if(nums[i]==0)
        //        max=1;
        // }
        // max=1;
        // for(int i=nums.length-1;i>=0;i--)
        // {
        //     max*=nums[i];
        //     m=Math.max(m,max);
        //     if(nums[i]==0)
        //        max=1;
        // }
        // return m;
        
        
        int max=1,min=1,m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int x=max;
    
                max=Math.max(max*nums[i],Math.max(nums[i],min*nums[i]));
            min=Math.min(x*nums[i],Math.min(nums[i],min*nums[i]));
                 m=Math.max(m,max);
            
        }
        return m;
    }
}