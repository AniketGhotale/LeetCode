class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int res[][] = score;
        int n= res.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(res[j][k] <= res[j+1][k]){
                    int temp[] = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
            }
        }
        return res;
    }
}