class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res[] = new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int len = Integer.toString(grid[i][j]).length();
                if(res[j] < len){
                    res[j] = len;
                }
            }
        }
        return res;
    }
}