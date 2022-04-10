class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int sum=nums[i]+nums[j];
                int ll=j+1,r=nums.length-1;
                while(ll<r)
                {
                  
                    if(sum+nums[ll]+nums[r]==target)
                    {
                       l.add(new ArrayList<Integer>());
                        l.get(l.size()-1).add(nums[i]);
                        l.get(l.size()-1).add(nums[j]);
                        l.get(l.size()-1).add(nums[ll]);
                        l.get(l.size()-1).add(nums[r]);
                         while(ll<r && nums[ll]==nums[ll+1])ll++;
                         while(ll<r && nums[r]==nums[r-1])r--;
                    }
                     
                    if(sum+nums[ll]+nums[r]>target)
                        r--;
                    else
                        ll++;
                }
                  while(j+1<nums.length && nums[j]==nums[j+1])j++;
                         
            }
            while(i+1<nums.length && nums[i]==nums[i+1])i++;
        }
        return l;
    }
}