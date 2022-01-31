class Solution {
    public String interpret(String command) {
       String x="";
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='(' )
              {
                if(command.charAt(i+1)==')')
                {  
                 x+="o";
                    i++;
                }
                 else
                 {
                     x+="al";
                     i+=3;
                 }
                  
              }
            else
               x+="G";
        }
        return x;
    }
}