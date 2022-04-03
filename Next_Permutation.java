class Solution {
    public void nextPermutation(int[] nums) {
       int x=nums[nums.length-1],ind=-1;
        for(int i=nums.length-1;i>0;i--)
        {
          if(nums[i-1]<nums[i])
          {
              ind=i;
              break;
          }
        }
        if(ind==-1)
        {
            Arrays.sort(nums);
        }
        else
        {
            //find number that is greater than the ind but smallest of the array from (ind to nums.length)
            x=ind;
            for(int i=nums.length-1;i>=ind;i--)
            {
                if(nums[i]>nums[ind-1])
                {
                    x=i;
                    break;
                }
            }
            
            //swap numbers
            int t=nums[x];
            nums[x]=nums[ind-1];
            nums[ind-1]=t;
            
            //sort the remaining array from (ind to nums.length in asc order)
            x=nums.length-1;
            while(ind<x)
            {
                t=nums[ind];
                nums[ind]=nums[x];
                nums[x]=t;
                ind++;
                x--;
            }
        }
    }
}