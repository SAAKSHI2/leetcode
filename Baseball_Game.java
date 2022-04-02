class Solution {
    public int calPoints(String[] ops) {
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("+"))
            {
                ans.add(ans.get(ans.size()-1)+ans.get(ans.size()-2));
            }
            else if(ops[i].equals("D"))
                ans.add(ans.get(ans.size()-1)*2);
            else if(ops[i].equals("C"))
                ans.remove(ans.size()-1);
            else
                ans.add(Integer.parseInt(ops[i]));
        }
        int out=0;
        for(int i=0;i<ans.size();i++)
        {
            out+=ans.get(i);
        }
        return out;
    }
}