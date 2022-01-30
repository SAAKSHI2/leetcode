class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0,c=1,count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[j]==nums[i])
            {
                c++;
                if(c<=2)
                {
                     nums[++j]=nums[i];
                     count++;
                }
            }
            else
            {
                nums[++j]=nums[i];
                c=1;
                count++;
            }
        }
        return count;
    }
}