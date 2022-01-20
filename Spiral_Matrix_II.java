class Solution {
    public int[][] generateMatrix(int n) {
        int m[][]=new int[n][n];
        int x=0,y=0,count=1;
        for(int i=0;i<(n+1)/2;i++)
        {
            for(int j=i;j<n-i;j++)
            {
                m[i][j]=count;
                count++;
            }
            for(int j=i+1;j<n-i;j++)
            {
                m[j][n-1-i]=count;
                count++;
            }
            for(int j=n-2-i;j>=i;j--)
            {
                m[n-1-i][j]=count;
                count++;
            }
             for(int j=n-2-i;j>i;j--)
            {
                m[j][i]=count;
                count++;
            }
            
        }
        return m;
    }
}