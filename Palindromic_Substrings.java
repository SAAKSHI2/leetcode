class Solution {
//     int c=0;
//     void func(int ind,String s,String x)
//     {
//         if(ind==s.length())
//             return;
       
//             x+=s.charAt(ind);
//            func(ind+1,s,x);
//         if(pali(x))
//             c++;
//     }
//     boolean pali(String s)
//     {
//         int l=0,r=s.length()-1;
//         while(l<r)
//         {
//             if(s.charAt(l)!=s.charAt(r))
//                 return false;
//             l++;
//             r--;
//         }
//         return true;
//     }
    public int countSubstrings(String s) {
        // for(int i=0;i<s.length();i++){
        // func(i,s,"");
        // }
        // return c;
        int dp[][]=new int[s.length()][s.length()];
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            dp[i][i]=1;
            c++;
            if((i+1<s.length())&&s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=1;
                c++;
            }
        }
        for(int i=2;i<s.length();i++)
        {
            for(int j=0;j+i<s.length();j++)
            {
                if((j+i)<s.length() && dp[j+1][i+j-1]==1 && s.charAt(j)==s.charAt(j+i)){
                    dp[j][i+j]=1;
                    c++;}
            }
        }
        return c;
    }
}