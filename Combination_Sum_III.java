class Solution {
    void func(List<List<Integer>> x,int ind,int k,int n,List<Integer> a)
    {
        if(a.size()==k)
        {
            if(n==0)
            {
                x.add(new ArrayList<Integer>(a));
                return;
            }
        }
        if(ind>9)
            return;
        a.add(ind);
        func(x,ind+1,k,n-ind,a);
        a.remove(a.size()-1);
        func(x,ind+1,k,n,a);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> x=new ArrayList<>();
        func(x,1,k,n,new ArrayList<Integer>());
        return x;
    }
}