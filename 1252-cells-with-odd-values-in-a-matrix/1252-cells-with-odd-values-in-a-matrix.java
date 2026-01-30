class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int res[][] = new int[m][n];
        for(int i=0; i<indices.length; i++){
            int currrow = indices[i][0];
            int currcol = indices[i][1];
            for(int j=0; j<n; j++){
                res[currrow][j] += 1;
            }
            for(int j=0; j<m; j++){
                res[j][currcol] += 1;
            }
        }
        int odd = 0; 
        for(int i=0; i<res.length;i++){
            for(int j=0; j<res[i].length; j++){
                if(res[i][j] %2 == 1){
                    odd++;
                }
            }
        }
        return odd;
    }
}