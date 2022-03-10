class Solution {
    public boolean check(char grid[][],int i,int j)
    {
        for(int k=i-1;k>=0;k--)
        {
            if( grid[k][j]=='Q')
                return false;
        }
        int x=i-1,y=j-1;
        while(x>=0 && y>=0)
        {
            if(grid[x][y]=='Q')
                return false;
            x--;
            y--;
        }
         x=i-1;y=j+1;
        while(x>=0 && y<=grid.length-1)
        {
            if(grid[x][y]=='Q')
                return false;
            x--;
            y++;
        }
    return true;
        
    }
    public int queen(int ans,int i,int j,char [][]grid)
    {
        if(i==grid.length)
        {
            ans++;
            return ans;
        }
        for(int k=0;k<grid.length;k++)
        {
            grid[i][k]='Q';
            if(check(grid,i,k))
            {
                ans=queen(ans,i+1,k,grid);
            }
            grid[i][k]='.';
        }
        return ans;
    }
   
    public int totalNQueens(int n) {
        int ans=0;
         char grid[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                grid[i][j]='.';
        }
        ans=queen(ans,0,0,grid);
        return ans;
    }
}