class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.push(0);
            else
            {
               if(st.peek()!=0)
               {
                   int x=0;
                   while(st.peek()!=0)
                   {
                       x+=st.pop();
                   }
                   x=x*2;
                   st.pop();
                   st.push(x);
               }
                else
                {
                    st.pop();
                    st.push(1);
                }
            }
                
        }
        int ans=0;
        while(st.size()!=0)
            ans+=(st.pop());
        return ans;
    }
}