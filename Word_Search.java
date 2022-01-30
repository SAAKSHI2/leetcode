class Solution {
    boolean func(char[][] b,boolean [][] v,String w,int c,int r,int ind)
    {
        if(c<0|| c>=b[0].length|| r<0 || r>=b.length || ind>=w.length()|| w.charAt(ind)!=b[r][c] || v[r][c]==true)
        {
            return false;
        }
        if(ind==w.length()-1)
            return true;
        v[r][c]=true;
        boolean bo=func(b,v,w,c+1,r,ind+1)||func(b,v,w,c,r+1,ind+1)||func(b,v,w,c-1,r,ind+1)||func(b,v,w,c,r-1,ind+1);
        v[r][c]=false;
        return bo;
    }
    public boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
               if(func(board,visited,word,j,i,0))
                   return true;
            }
        }
        return false;
    }
}