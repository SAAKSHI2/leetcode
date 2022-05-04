class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            if(nums[r]%2==0 && nums[l]%2==0)
            {
                l++;
            }
            else if(nums[r]%2==0 && nums[l]%2!=0)
            {
                int t=nums[r];
                nums[r]=nums[l];
                nums[l]=t;
                l++;
                r--;
            }
            else if(nums[r]%2!=0){
                r--;
            }
            else if(nums[l]%2==0)
                l++;
        }
        return nums;
    }
}