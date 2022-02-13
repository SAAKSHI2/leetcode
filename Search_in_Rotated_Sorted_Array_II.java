class Solution {
    public boolean search(int[] nums, int target) {
        // Arrays.sort(nums);
        // int l=0,h=nums.length-1;
        // while(l<=h)
        // {
        //     int mid=(l+h)/2;
        //     if(nums[mid]==target)
        //         return true;
        //     else if(target>nums[mid])
        //         l=mid+1;
        //     else
        //         h=mid-1;
        // }
        for(int i=0;i<nums.length;i++)
            if(nums[i]==target)
                return true;
        return false;
    }
}