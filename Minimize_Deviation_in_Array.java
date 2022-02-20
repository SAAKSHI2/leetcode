class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> s=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
                s.add(nums[i]*2);
            else
            s.add(nums[i]);
        }
        int ans=Integer.MAX_VALUE;
        while(true)
        {
            int g=s.last();
            int sm=s.first();
            ans=Math.min(ans,g-sm);
            if(g%2==0)
            {
                s.remove(g);
                s.add(g/2);
            }
            else
                break;
            
        }
        return ans;
    }
}