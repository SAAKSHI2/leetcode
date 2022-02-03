class Solution {
    public int[] decrypt(int[] code, int k) {
        int o[]=new int[code.length];
        if(k==0)
            return o;
        if(k>0)
        {
        for(int i=0;i<code.length;i++)
        {
            int x=k,j=i+1;
            while(x>=1)
            {
                if(j>=code.length)
                    j=0;
                o[i]+=code[j];
                j++;
                x--;
            }
        }
        }
        else
        {
            for(int i=0;i<code.length;i++)
            {
                int x=k*(-1),j=i-1;
                while(x>=1)
                {
                    if(j<0)
                     j=code.length-1;
                    o[i]+=code[j];
                    j--;
                    x--;
                }
            }
        }
        return o;
    }
}