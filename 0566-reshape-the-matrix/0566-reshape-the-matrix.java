class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
         int n= mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
         int[][] result = new int[r][c];
         int row=0;
         int col=0;
         for(int i=0;i<mat.length;i++){
              for(int j=0;j<mat[0].length;j++){
             result[row][col] =mat[i][j];
             col++;
             if(col==c){
                col=0;
                row++;
             }
         }
         }
         return result;
    }
}