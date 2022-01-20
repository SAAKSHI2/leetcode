class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a=new ArrayList<>();
        int n=matrix[0].length,m=matrix.length,c=m*n;
        for(int i=0;i<(matrix.length+1)/2 && c>0;i++)
        {
             for(int j=i;j<n-i && c>0;j++)
             {
              a.add(matrix[i][j]);
                 c--;
             }
             for(int j=i+1;j<matrix.length-i && c>0;j++)
             {
              a.add(matrix[j][n-i-1]);
                 c--;
             }
            
             for(int j=n-2-i;j>i&&c>0;j--)
             {
              a.add(matrix[matrix.length-i-1][j]);
                 c--;
             }
            for(int j=matrix.length-1-i;j>i &&c>0;j--)
            {
              a.add(matrix[j][i]);
                c--;
            }
        }
        return a;
    }
}