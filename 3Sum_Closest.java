class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0,ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
         //   int val=0;
            int l=i+1,r=nums.length-1;
            while(l<r)
            {
               sum=(nums[i]+nums[l]+nums[r]);
                if(diff>Math.abs(sum-target))
                {  
                    diff=Math.abs(sum-target);
                   ans=sum;
                    
                }
               if(sum<target)
                   l++;
                else
                    r--;
            }
        }
        return ans;
    }
}