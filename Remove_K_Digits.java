class Solution {
    public String removeKdigits(String num, int k) {
     Stack<Integer> st=new Stack<>();
        if(num=="0" || k==num.length())
            return "0";
        int i=0;
        while(i<num.length())
        {
           while(k>0 && st.size()!=0 && (num.charAt(i)-'0'<st.peek()))
           {
               st.pop();
               k--;
           }
            st.push(num.charAt(i)-'0');
            i++;
        }
        while(st.size()!=0 && k>0)
        {
            st.pop();
            k--;
        }
        if(st.size()==0)
            return "0";
       String s="";
        while(st.size()!=0)
        {
            String x=String.valueOf(st.pop());
            s=x+s;
        }
      while(s.length()>1 && s.charAt(0)=='0')
          s=s.substring(1);
    
        return s;
    }
}