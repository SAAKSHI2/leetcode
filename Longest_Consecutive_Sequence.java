class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            s.add(nums[i]);
        int ss=0;
        for(int i=0;i<nums.length;i++)
        {
                int x=nums[i];
            if(!s.contains(x-1))
            {
                while(s.contains(x))
                {
                    s.remove(x);
                    x++;
                }
            ss=(x-nums[i])>ss?x-nums[i]:ss;
            }
          }
           return ss;
        }
     
}