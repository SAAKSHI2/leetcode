class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> l= new ArrayList<Integer>();
        for(int i=1;i<n+1;i++)
            l.add(i);
        int x=k-1;
        while(l.size()>1)
        {
            x=x%l.size();
            l.remove(x);
            x+=(k-1);
        }
        return l.get(0);
    }
}