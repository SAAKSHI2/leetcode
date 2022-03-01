class Solution {
    public String reverseWords(String s) {
        String ss[]=s.split(" ");
        s="";
        for(int i=0;i<ss.length;i++)
        {
            if(ss[ss.length-1-i]!="")
             s+=(ss[ss.length-1-i])+" ";
            
        }
       return s.substring(0,s.length()-1);
    }
}