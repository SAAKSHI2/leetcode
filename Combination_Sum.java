class Solution {
    void func(int[] c,int t,List<List<Integer>> a,int i,List<Integer> x)
    {
        if(i==c.length)
        {
            if(t==0)
            {
                a.add(new ArrayList<>(x));
            }
            return;
        }
        if(t>=c[i])
        {
            x.add(c[i]);
            func(c,t-c[i],a,i,x);
            x.remove(x.size()-1);
        }
        func(c,t,a,i+1,x);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> a =new ArrayList<>();
        List<Integer> x =new ArrayList<>();
        func(candidates,target,a,0,x);
        return a;
    }
}