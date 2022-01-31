class Solution {
    void func( List<List<Integer>> a,int ind,int nums[],List<Integer> x)
    {
         a.add(new ArrayList<>(x));
       for(int i=ind;i<nums.length;i++)
        {
            if(i!=ind && nums[i]==nums[i-1]) continue;
            x.add(nums[i]);
           func(a,i+1,nums,x);
           x.remove(x.size()-1);
        }
      
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> x=new ArrayList<>();
           func(a,0,nums,x);
        return a;
    }
}