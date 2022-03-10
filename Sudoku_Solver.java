class Solution {
    public boolean check(int i,int j,char board[][])
    {
       for(int k=0;k<9;k++)
        {
            if(k!=j && board[i][k]==board[i][j])
                return true;
        }
        for(int k=0;k<9;k++)
        {
            if(k!=i &&board[k][j]==board[i][j])
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
    public boolean solver(char[][] board,int i,int j)
    {
        if(i==board.length-1 && j==board.length)
            return true;
        if(j==board.length)
        {
            i++;
            j=0;
        }
        if(board[i][j]!='.')
            return solver(board,i,j+1);
        char ch='1';
        while(ch<='9')
        {
            board[i][j]=ch;
            if(!check(i,j,board))
            {
                if(solver(board,i,j+1))
                    return true;
            }
              board[i][j]='.';
            ch++;
        }
        return false;
         
    }
    public void solveSudoku(char[][] board) {
        solver(board,0,0);
    }
}