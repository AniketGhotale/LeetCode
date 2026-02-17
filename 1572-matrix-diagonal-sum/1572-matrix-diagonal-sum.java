class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0; 
        int j = 0;
        int sum = 0;
        while(i<mat[0].length){
            sum+=mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=mat.length-1;
        while(j >= 0){
            sum+=mat[i][j];
            i++;
            j--;
        }
        int l = mat.length;
        if(l%2==1){
            int idx = l/2;
            sum-=mat[idx][idx];
        }
        return sum;
    }
}