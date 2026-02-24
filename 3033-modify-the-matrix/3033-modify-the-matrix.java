class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = update(j,m,matrix);
                }
            }
        }
        return matrix;
    }
    int update(int col, int m, int[][] matrix){
        int max = 0;
        for(int i=0; i<m; i++){
            if(matrix[i][col] > max){
                max = matrix[i][col];
            }
        }
        return max;
    }
}