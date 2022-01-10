class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int k=1;
        int v=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=v)
            {
                v=nums[i];
                nums[k]=nums[i];
                k++;
            }  
        }
        
        return k;
    }
}