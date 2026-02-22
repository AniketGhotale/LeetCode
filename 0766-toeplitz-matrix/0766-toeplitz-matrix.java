class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flag = true;
        for(int i=0; i<m-1; i++){
            int row = i;
            for(int j=0; j<n-1; j++){
                int col = j;
                if(matrix[i][j] != matrix[i+1][j+1]){
                    flag = false;
                    break;
                }
                int val = matrix[i][j];
                // while(row < m && col < n){
                //     if(matrix[row][col] != val){
                //         flag = false;
                //         break;
                //     }
                //     row++;
                //     col++;
                // }
            }
        }
        return flag;
    }
}