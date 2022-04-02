class Solution {
    public boolean check(String ss)
    {
        for(int i=0;i<ss.length()/2;i++)
        {
            if(ss.charAt(i)!=ss.charAt(ss.length()-1-i))
                return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                if(check(s.substring(0,i)+s.substring(i+1)))
                {
                    return true;
                }
                if(check(s.substring(0,s.length()-1-i)+s.substring(s.length()-1-i+1)))
                {
                    return true;
                }
                else
                    return false;
            }
        }
        return true;
    }
}