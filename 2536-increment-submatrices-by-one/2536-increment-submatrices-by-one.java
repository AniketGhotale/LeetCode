class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] res = new int[n][n];

        for (int i = 0; i < queries.length; i++) {
            int row1 = queries[i][0];
            int col1 = queries[i][1];
            int row2 = queries[i][2];
            int col2 = queries[i][3];

            fill(row1, col1, row2, col2, res);
        }
        return res;
    }

    void fill(int row1, int col1, int row2, int col2, int[][] res) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                res[i][j]++;
            }
        }
    }
}



// class Solution {
//     public int[][] rangeAddQueries(int n, int[][] queries) {
//         int res[][]= new int[n][n];
//         for(int i=0; i<queries.length; i++){
//             int row1=queries[i][0];
//             int col1=queries[i][1];
//             int row2=queries[i][2];
//             int col2=queries[i][3];
//             fill(row1,col1,row2,col2,res);
//             // res[row1][col1]++;
//             // res[row2][col2]++;
//             // res[row2][col1]++;
//             // res[row1][col2]++;
//         }
//         return res;
//     }
//     void fill(int row1, int col1,int row2,int col2,int res[][]){
        
//         while(row1 <= row2){
//             res[row1][col1]++;
//             //res[row2][col2]++;
//             row1++;
//         }
//         while(col1 <= col2){
//             res[row1][col1]++;
//             //res[row2][col2]++;
//             col1++;
//         }
//     }
// }