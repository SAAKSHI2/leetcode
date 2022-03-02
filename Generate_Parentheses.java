class Solution {
    void func(List<String> s,String st,int i,int j,int n)
    {
        if(i==n&&j==n)
        {
            s.add(st);
            return;
        }
        if(i<n)
        {
            func(s,st+"(",i+1,j,n);
        }
        if(j<i)
            func(s,st+")",i,j+1,n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<>();
        func(s,"(",1,0,n);
        return s;
    }
}