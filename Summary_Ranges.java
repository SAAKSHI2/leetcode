class Solution {
    public List<String> summaryRanges(int[] nums) {
        String s="";
        List<String> ans=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums.length-1 &&nums[i+1]==nums[i]+1)
            {
                if(c!=1)
                {
                 s=nums[i]+"->";
                    c=1;
                }
            }
            else
            {
                s+=nums[i];
                ans.add(s);
                s="";
                c=0;
            }
        return ans;
        
    }
}