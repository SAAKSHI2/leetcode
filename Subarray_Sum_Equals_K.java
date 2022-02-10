class Solution {
  
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int sum=0,c=0;
        m.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=(nums[i]);
            if(m.containsKey(sum-k))
                c+=m.get(sum-k);
               m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return c;
    }
}