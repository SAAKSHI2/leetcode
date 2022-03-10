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
    public boolean queen(List<List<String>> ans,int i,int j,char [][]grid)
    {
        if(i==grid.length)
        {
            String s="";
            List<String> l=new ArrayList<>();
            for(int k=0;k<grid.length;k++)
            {
                s="";
                for(int o=0;o<grid.length;o++)
                s+=grid[k][o];
                l.add(s);
                
            }
            ans.add(new ArrayList<String>(l));
            return true;
        }
        for(int k=0;k<grid.length;k++)
        {
            grid[i][k]='Q';
            if(check(grid,i,k))
            {
                queen(ans,i+1,k,grid);
            }
            grid[i][k]='.';
        }
        return false;
        
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char grid[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                grid[i][j]='.';
        }
        queen(ans,0,0,grid);
        return ans;
    }
}