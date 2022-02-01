class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int l=0,r=nums.length-1;
        while(l<r)
        {
            if(nums[l]+nums[r]==k)
            {
                c++;
                l++;
                r--;
            }
            else if(nums[l]+nums[r]>k)
                r--;
            else
                l++;    
        }
        return c;
    }
}