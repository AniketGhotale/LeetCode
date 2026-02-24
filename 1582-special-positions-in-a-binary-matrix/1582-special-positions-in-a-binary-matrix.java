class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    if(check(i,j,mat,m,n)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    boolean check(int row,int col, int[][] mat,int m, int n){
        for(int i=0; i<m; i++){
            if((i != row) && mat[i][col] != 0){
                return false;
            }
        }
        for(int i=0; i<n; i++){
            if((i != col) && mat[row][i] != 0){
                return false;
            }
        }
        return true;
    }
}