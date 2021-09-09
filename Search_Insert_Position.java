class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1;
        if(target<nums[0])
            return 0;
        if(target>nums[nums.length-1])
            return nums.length;
        while(l<=h)
        {
            int mid=l+((h-l)/2);
            if(nums[mid]==target ||(mid-1>=0 && (nums[mid-1]<target && nums[mid]>target)))
                return mid;
            else if(target<nums[mid])
                h=mid-1;
            else
                l=mid+1;
        }
        return nums.length;
    }
}