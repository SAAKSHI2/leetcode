class Solution {
    void func(int n,List<List<Integer>> a,int ind,List<Integer> x,int k)
    {
        if(x.size()==k)
        {
            a.add(new ArrayList<>(x));
            return;
        }
        if(ind>n)
            return;
        x.add(ind);
        func(n,a,ind+1,x,k);
        x.remove(x.size()-1);
        func(n,a,ind+1,x,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> a=new ArrayList<>();
        func(n,a,1,new ArrayList<>(),k);
        return a;
    }
}