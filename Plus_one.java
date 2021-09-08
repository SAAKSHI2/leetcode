class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9)
        {
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        else
        {
        if(digits.length==1)
        {
            int a[]=new int[2];
            a[0]=1;
            a[1]=0;
            return a;
        }
            else
            {
               for(int i=0;i<digits.length;i++)
               {
                   if(digits[digits.length-1-i-1]==9)
                   {
                      digits[digits.length-1-i] =0;
                       if(digits.length-1-i-1==0)
                       {
                           int a[]=new int[digits.length+1];a[0]=1;
                           return a;
                       }
                   }
                   else
                   {
                        digits[digits.length-1-i] =0;
                       digits[digits.length-2-i]=digits[digits.length-2-i]+1;
                       return digits;
                   }
               }
                
            }
        }
            
     return digits;   
    }
}