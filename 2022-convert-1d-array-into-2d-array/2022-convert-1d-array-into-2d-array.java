class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int res[][] = new int[m][n];
        int idx = 0;
        if(m*n == original.length){
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    res[i][j] = original[idx];
                    idx++;
                }
            }
        }else{
            return new int[0][0];
        }
        return res;
    }
}