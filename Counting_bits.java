class Solution {
    public int[] countBits(int n) {
        int x[]=new int[n+1];
        int c=0;
        x[0]=0;
        if(n==0)
            return x;
        x[1]=1;
        for(int i=2;i<=n;i++)
        {
            x[i]=x[i>>1]+(i&1);
        }
        return x;
    }
}