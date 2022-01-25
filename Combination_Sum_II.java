class Solution {
    void func(int[] c,int t,List<Integer> x,int i,List<List<Integer>> a)
    {
        if(t==0)
        {
            a.add(new ArrayList<Integer>(x));
            return;
        }
        for(int k=i;k<c.length;k++)
        {
            if(k>i && c[k]==c[k-1])
                continue;
            if(c[k]>t)
                break;
            x.add(c[k]);
            func(c,t-c[k],x,k+1,a);
            x.remove(x.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> x=new ArrayList<>();
        Arrays.sort(candidates);
        func(candidates,target,x,0,a);
        return a;
    }
}