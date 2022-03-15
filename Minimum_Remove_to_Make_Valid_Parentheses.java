class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push("("+i);
            }
            else if(s.charAt(i)==')')
            {
                if(st.size()>0 && st.peek().charAt(0)=='(')
                    st.pop();
                else
                    st.push(")"+i);
            }
        }
         if(st.size()==0)
             return s;
        while(st.size()>0)
        {
            int x=Integer.parseInt(st.peek().substring(1));
            if(x==0)
               s=s.substring(1);
            else
               s=s.substring(0,x)+s.substring(x+1);
            st.pop();
        }
        return s;
        
    }
}