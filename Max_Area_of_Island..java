class Solution {
    public int func(int[][] grid,int i,int j,int[][] visited)
    {
        if(i>=grid.length|| j>=grid[0].length)
            return 0;
        if(i<0 || j<0)
            return 0;
        if(visited[i][j]==1)
            return 0;
    if(grid[i][j]==0)
        return 0;
        visited[i][j]=1;
        return 1+func(grid,i+1,j,visited)+func(grid,i-1,j,visited)+func(grid,i,j+1,visited)+func(grid,i,j-1,visited);
    
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        int visited[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0 && visited[i][j]==0)
                {
                    ans=Math.max(func(grid,i,j,visited),ans);
                }
            }
        }
        return ans;
    }
}