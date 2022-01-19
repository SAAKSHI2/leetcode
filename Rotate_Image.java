class Solution {
    public void rotate(int[][] matrix) {
        int l=matrix.length-1;
        for(int i=0;i<matrix.length/2;i++)
        {
            for(int j=i;j<matrix.length-i-1;j++)
            {
                int t=matrix[j][i];
                matrix[j][i]=matrix[l-i][j];
                matrix[l-i][j]=matrix[l-j][l-i];
                matrix[l-j][l-i]=matrix[i][l-j];
                matrix[i][l-j]=t;
            }
        }
    }
}