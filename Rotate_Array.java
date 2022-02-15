class Solution {
    void func(int nums[],int s,int e)
    {
        while(s<=e)
        {
            int t=nums[s];
            nums[s++]=nums[e];
            nums[e--]=t;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
       // int n[]=new int[nums.length];
       //  for(int i=0;i<k;i++)
       //  {
       //      n[i]=nums[nums.length-k+i];
       //  }
       //  for(int i=0;i<nums.length-k;i++)
       //      n[i+k]=nums[i];
       //  for(int i=0;i<n.length;i++)
       //      nums[i]=n[i];
        // for(int i=0;i<nums.length/2;i++)
        // {
        //     int t=nums[i];
        //         nums[i]=nums[nums.length-1-i];
        //     nums[nums.length-1-i]=t;
        // }
        // for(int i=0;i<k/2;i++)
        // {
        //     int t=nums[i];
        //         nums[i]=nums[k-1-i];
        //     nums[k-1-i]=t;
        // }
        //  for(int i=0;i<(nums.length-k)/2;i++)
        // {
        //     int t=nums[i+k];
        //         nums[i+k]=nums[nums.length-1-i];
        //     nums[nums.length-1-i]=t;
        // }
        func(nums,0,nums.length-1);
        func(nums,0,k-1);
        func(nums,k,nums.length-1);
    }
}