class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                c++;
            if(c>nums.length/2)
                return nums[i];
            }
            else
                c=1;
        }
        return 0;
    }
}