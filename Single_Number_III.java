class Solution {
    public int[] singleNumber(int[] nums) {
        int x[]=new int[2],w=0;
        Arrays.sort(nums);
        if(nums.length==2)
            return nums;
        if(nums[0]!=nums[1])
            x[w++]=nums[0];
        for(int i=1;i<nums.length-1;i++)
        {
           if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
               x[w++]=nums[i];
            if(w>=2)
                break;
        }
        if(w<2)
            x[w++]=nums[nums.length-1];
        return x;
    }
}