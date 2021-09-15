class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int flag=1;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==nums[i] && j!=i)
                {
                    flag=0;
                    break; 
                }
            }
            if(flag==1)
                return nums[i];
        }
        return 0;
    }
}