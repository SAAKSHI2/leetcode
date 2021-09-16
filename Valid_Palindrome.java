class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String ss="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')|| (s.charAt(i)>='0' && s.charAt(i)<='9'))
                ss+=s.charAt(i);
        }
        StringBuilder sb=new StringBuilder(ss);
        sb.reverse();
     
        if(ss.equals(sb.toString()))
            return true;
        return false;
    }
}