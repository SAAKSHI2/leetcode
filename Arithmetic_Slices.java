class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)
            return 0;
        int m=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int d=nums[i]-nums[i+1];
            int c=2;
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(nums[j]-nums[j+1]==d)
                    c++;
                else
                    break;
                if(c>=3)
                m++;
            }      
        }
        return m;
    }
}