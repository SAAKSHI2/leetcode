class Solution {
    public boolean buddyStrings(String s, String goal) {
        int x=Integer.MIN_VALUE,y=Integer.MIN_VALUE;
        if(s.length()==0 || s.length()!=goal.length())
            return false;
        int flag=0;
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)!=goal.charAt(i))
           {
             if(x>=0 && y>=0)
               return false;
              else
              {
                  if(x<0)
                    x=i;
                  else
                      y=i;
              }
           }
           if(i>0 && ch[i]==ch[i-1])
               flag=1;
       }
        if((x>=0 && y>=0) && s.charAt(y)==goal.charAt(x) && (s.charAt(x)==goal.charAt(y)))
            return true;
        if(flag==1 && s.equals(goal))
            return true;
       return false;     
    }
}