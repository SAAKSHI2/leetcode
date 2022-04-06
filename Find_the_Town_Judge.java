class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)
            return 1;
        if(trust.length==0)
         return -1;
        int t[]=new int[n];
        int nt[]=new int[n];
        for(int i=0;i<trust.length;i++)
        {
            nt[trust[i][0]-1]=1;
            t[trust[i][1]-1]++;
        }
        int x=-1,flag=0;
        for(int i=0;i<n;i++)
        {
            if(t[i]==n-1 && nt[i]==0)
            {
                x=i+1;
                flag++;
            }
            
            if(flag>1)
                return -1;
        }
        return x;
    }
}