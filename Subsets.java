class Solution {
    void func(List<List<Integer>> l,int i,int []nums,List<Integer> x)
    {
        l.add(new ArrayList<Integer>(x));
        for(int k=i;k<nums.length;k++)
        {
            if(k>i && nums[k]==nums[k-1])
                continue;
            
             x.add(nums[k]);
            func(l,k+1,nums,x);
             x.remove(x.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l =new ArrayList<>();
        Arrays.sort(nums);
        func(l,0,nums,new ArrayList<Integer>());
        return l;
    }
}