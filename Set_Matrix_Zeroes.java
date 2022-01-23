class Solution {
    void setZero(int x,int y,int[][] matrix)
    {
        for(int i=0;i<matrix[0].length;i++)
            matrix[x][i]=0;
        for(int i=0;i<matrix.length;i++)
            matrix[i][y]=0;
    }
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        int c=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                 if(matrix[i][j]==0)
                 {
                     a.add(new ArrayList<Integer>());
                     a.get(c).add(i);
                     a.get(c).add(j);
                     c++;
                  //   setZero(i,j,matrix);
                 }
            }
        }
        for(int i=0;i<c;i++)
        {
            setZero(a.get(i).get(0),a.get(i).get(1),matrix);
        }
      
    }
}