class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        // int m = grid.length;
        // int n = grid[0].length;
        // int res[][] =new int[m][n];
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
                
        //     }
        // }
        int row = x+k-1;
        for(int i=x; i<x+k/2; i++){
            for(int j=y; j<y+k; j++){
                int temp = grid[i][j];
                grid[i][j] = grid[row][j];
                grid[row][j] = temp;
            }
            row--;
        }
        return grid;
    }
}