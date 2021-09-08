class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        int c=0;
        for(int i=0;i<strs[0].length();i++)
        {
            c=0;
            String x=strs[0].substring(0,i+1);
            for(int j=1;j<strs.length;j++)
            {
                String r=strs[j].substring(0,Math.min(i+1,strs[j].length()));
                if(r.equals(x))
                    c++;
                else
                    break;
            }
            if(c==strs.length-1 && x.length()>s.length())
                s=x;
        }
        return s;
    }
}