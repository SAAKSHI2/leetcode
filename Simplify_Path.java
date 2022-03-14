class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        s.push("/");
        for(int i=1;i<path.length();i++)
        {
            if(path.charAt(i)=='/')
            {
                if(!s.peek().equals("/"))
                    s.push(path.charAt(i)+"");
             }
            else if((i+1)<path.length()&& path.charAt(i)=='.' && path.charAt(i+1)=='.')
            {
                if((i+2)<path.length()&&path.charAt(i+2)!='/')
                {
                    String x="";
                    while(i<path.length()&&path.charAt(i)!='/')
                    {
                        x+=path.charAt(i);
                        i++;
                    }
                    s.push(x);
                    i--;
                    
                }
                else{
                if(s.size()>1 && s.peek().equals("/"))
                {
                    s.pop();
                }
                if(s.size()>1)
                    s.pop();
                i++;
                }
            }
            else if(path.charAt(i)=='.' && ((i+1)<path.length()&&path.charAt(i+1)=='/'))
                continue;
            else
            {
                     String x="";
                    while(i<path.length()&&path.charAt(i)!='/')
                    {
                        x+=path.charAt(i);
                        i++;
                    }
                    s.push(x);
                    i--;     
            }
            
        }
        if(s.peek().equals(".") && s.size()>1)
        {
            s.pop();
        }
        if(s.peek().equals("/") && s.size()>1)
        {
            s.pop();
         System.out.println(s);
        }
       
        String ans="";
        while(s.size()!=0)
        {
         ans=s.pop()+ans;   
        }
        return ans;
    }
}