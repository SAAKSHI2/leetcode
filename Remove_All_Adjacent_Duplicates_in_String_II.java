class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<List<Integer>> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.size()==0)
            {
                List<Integer> l=new ArrayList<>();
                l.add(i);
                l.add(1);
                st.push(l);
            }
            else 
            {
               if(st.peek().get(1)==k){
                        st.pop();
               }
                
              List<Integer> l=new ArrayList<>();
                l.add(i);
                if(st.size()>0 && s.charAt(st.peek().get(0))==s.charAt(i))
                {
                   l=st.pop();
                    l.set(1,l.get(1)+1);
                    st.push(l);
                }
                else
                {
                    l.add(1);
                st.push(l);
                }
            }
           // System.out.println(st.peek());
        }
        String ans="";
         if(st.peek().get(1)==k){
                st.pop();
               }
        while(st.size()!=0)
        {
             List<Integer> l=new ArrayList<>();
            l=st.pop();
           int x=0;
            while(x<l.get(1))
            {
               ans=s.charAt(l.get(0))+ans;
                x++;
            }
           
        }
        return ans;
    }
}