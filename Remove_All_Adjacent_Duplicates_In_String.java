class Solution {
    public String removeDuplicates(String s) {
        // int i=0;
        // while(i<s.length()-1)
        // {
        //     if(s.charAt(i)==s.charAt(i+1))
        //     {
        //         s=s.substring(0,i)+s.substring(i+2);
        //         i=-1;
        //     }
        //     i++;
        // }
        Stack<Character> ss=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
                if(ss.size()>0 && ss.peek()==s.charAt(i))
                    ss.pop();
               
               else
                ss.push(s.charAt(i));
        }
        String x="";
        while(ss.size()>0)
        {
            x=(ss.pop())+x;
        }
        return x;
    }
}