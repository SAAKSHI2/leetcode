class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int l=0,h=nums.length-1;
        int a[]=new int[2];
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target)
            {
                for(int i=mid;i>=0;i--)
                {
                    if(nums[i]==target)
                    {
                        a[0]=i;
                    }
                    else
                        break;
                }
                for(int i=mid;i<nums.length;i++)
                {
                    if(nums[i]==target)
                    {
                        a[1]=i;
                    }
                    else
                        break;
                }
                return a;
            }
            else if(nums[mid]>target)
                h=mid-1;
            else
                l=mid+1;
        }
        a[0]=-1;
        a[1]=-1;
        return a;
    }
}