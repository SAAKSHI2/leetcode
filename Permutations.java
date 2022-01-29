class Solution {
    public void func(int nums[],List<Integer> x,List<List<Integer>> a,int ind)
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
            func(nums,x,a,ind+1);
             t=nums[ind];
            nums[ind]=nums[i];
            nums[i]=t;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        func(nums,new ArrayList<>(),a,0);
        return a;
    }
}