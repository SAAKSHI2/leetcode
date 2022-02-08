class Solution {
    public String sortSentence(String s) {
        String ss[]=s.split(" ");
        String out[]=new String[ss.length];
        for(int i=0;i<ss.length;i++)
        {
            int c=Integer.parseInt(ss[i].charAt(ss[i].length()-1)+"");
            out[c-1]=ss[i].substring(0,ss[i].length()-1);
        }
        s="";
        for(int i=0;i<ss.length;i++)
        {
            s+=out[i]+" ";
        }
       s=s.trim();
        return s;
    }
}