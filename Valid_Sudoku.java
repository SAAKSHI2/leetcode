class Solution {
    public boolean check(int i,int j,char board[][])
    {
        for(int k=j+1;k<9;k++)
        {
            if(board[i][k]==board[i][j])
                return true;
        }
        for(int k=i+1;k<9;k++)
        {
            if(board[k][j]==board[i][j])
                return true;
        }
        for(int p=0;p<3;p++)
        {
            for(int q=0;q<3;q++)
            {
                if(((i/3)*3+p)==i && (j/3)*3+q==j)
                    continue;
                else if(board[(i/3)*3+p][((j/3)*3)+q]==board[i][j])
                    return true;
            }
        }
        return false;
        
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(check(i,j,board))
                        return false;
                }   
            }
        }
        return true;
    }
}