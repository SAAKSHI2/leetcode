class Solution {
    public boolean canJump(int[] nums) {
        int p=0,i=0,m=0;
        while(i<nums.length)
        {
            m=Math.max(m,nums[i]+i);
            if(i==p)
                p=m;
            i++;
        }
        if(p<nums.length-1)
            return false;
        return true;
    }
}