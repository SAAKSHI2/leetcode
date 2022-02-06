class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> x=new ArrayList<>();
        x.add(1);
        for(int i=1;i<=rowIndex;i++)
        {
            List<Integer> y=new ArrayList<>();
            y.add(1);
            for(int j=0;j<x.size()-1;j++)
            {
                y.add(x.get(j)+x.get(j+1));
            }
            y.add(1);
            x=y;
        }
        return x;
    }
}