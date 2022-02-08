class Solution {
    public String replaceDigits(String s) {
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
               ch[i]=(char)(ch[i-1]+ch[i]-48);
            }
        }
        s=String.valueOf(ch);
        return s;
    }
}