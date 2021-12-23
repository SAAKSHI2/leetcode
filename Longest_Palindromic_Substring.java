class Solution {
    public String longestPalindrome(String s) {
        int dp[][]=new int[s.length()][s.length()];
        int st=0,max=1;
        for(int i=0;i<s.length();i++)
        {
                    dp[i][i]=1;
        }
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=1;
                st=i;
                max=2;
            }
        }
     
        for(int i=2;i<s.length();i++)
        {
            for(int j=0;j<s.length()-i;j++)
            {
                int k=j+i;
                if(s.charAt(j)==s.charAt(k)&&dp[j+1][k-1]==1)
                {
                    dp[j][k]=1;
                    if(max<k-j+1)
                    {
                        max=k-j+1;
                        st=j;
                    }
                }
            }
        }
        return s.substring(st,st+max);
    }
}