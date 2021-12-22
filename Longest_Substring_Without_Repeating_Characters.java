class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=1,max=0;
        String sb;
        if(s.length()!=0)
        {
       sb=s.charAt(0)+"";
        }
        else
           sb="";
        for(int i=1;i<s.length();i++)
        {
            if(sb.contains(s.charAt(i)+""))
            {
                int x=sb.indexOf(s.charAt(i));
                sb=sb.substring(x+1)+(s.charAt(i)+"");
                if(max<l)
                    max=l;
                l=sb.length();
            }
            else
            {
                sb+=s.charAt(i)+"";
                l++;
            }
        }
         if(max<l && s.length()!=0)
            max=l;
        return max;
    }
}