class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
       String s=Integer.toString(x);
        int c=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)==s.charAt(s.length()-1-i))
                c++;
                else
                    break;
        }
        if(c==s.length()/2)
            return true;
        return false;
    }
}