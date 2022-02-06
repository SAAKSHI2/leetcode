class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
       List<Integer> x=new ArrayList<>();
        l.add(new ArrayList<Integer>());
        l.get(0).add(1);
        for(int i=1;i<numRows;i++)
        {
            x=new ArrayList<>();
            x.add(1);
             List<Integer> p=l.get(i-1);
            for(int j=0;j<p.size()-1;j++)
            {
               x.add(p.get(j)+p.get(j+1));
            }
          x.add(1);
             l.add(x);
        }
        return l;
    }
}