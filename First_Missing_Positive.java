class Solution {
    public int firstMissingPositive(int[] nums) {
    if(nums.length==0)
         return 1;
     Arrays.sort(nums);
     int x=1;
     for(int i=0;i<nums.length-1;i++)
     {
         if(nums[i]<=0)
             continue;
         if(nums[i]!=x)
             return x;
         if(nums[i]!=nums[i+1])
           x++;
     }
    if(x!=nums[nums.length-1])
        return x;
    return x+1;   
    }
}