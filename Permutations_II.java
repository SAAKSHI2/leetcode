class Solution {
    void func(Set<List<Integer>> a,int ind,List<Integer> x,int nums[])
    {
        if(ind==nums.length)
        {
            for(int i=0;i<nums.length;i++)
                x.add(nums[i]);
            a.add(new ArrayList<>(x));
            x.clear();
            return;
        }
        for(int i=ind;i<nums.length;i++)
        {
            int t=nums[ind];
            nums[ind]=nums[i];
            nums[i]=t;
            func(a,ind+1,x,nums);
            t=nums[ind];
            nums[ind]=nums[i];
            nums[i]=t;  
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
       Set<List<Integer>> a=new HashSet<>();
        func(a,0,new ArrayList<>(),nums);
         List<List<Integer>> a1=new ArrayList<>(a);
        return a1;
    }
}