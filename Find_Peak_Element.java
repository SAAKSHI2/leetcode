class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;
        if(nums.length==1)
            return 0;
        while(l<=r)
        {
            int m=(l+r)/2;
            if(m==0)
            {
                if(nums[1]>nums[0])
                    return 1;
                else
                    return 0;
            }
            else if(m==nums.length-1)
            {
                if(nums[nums.length-2]>nums[nums.length-1])
                    return nums.length-2;
                else
                    return nums.length-1;
            }
            
            if((m-1)>=0 && (m+1)<nums.length && nums[m-1]<nums[m] && nums[m+1]<nums[m])
                return m;
            if((m+1)<nums.length && nums[m+1]>nums[m])
            {
                   l=m+1;                
            }
            else
                r=m-1;
            
        }
        return 0;
    }
}