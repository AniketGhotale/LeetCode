class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int row = i;
            for(int j=0; j<n; j++){
                int col = j;
                boolean flag = true;
                for(int k=0; k<n; k++){
                    if(grid[k][col] != grid[row][k]){
                        flag = false;
                        
                    }
                }
                if(flag){
                    count++;
                }
            }
        }
        return count;
    }
}