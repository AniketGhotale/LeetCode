class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int arr[][] = new int[n][n];
        int row = 0;
        int col = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = (i*n) + j;
            }
        }
        for(int i=0; i<commands.size(); i++){
            if(commands.get(i).equals("RIGHT")){
                col++;
            }else if(commands.get(i).equals("LEFT")){
                col--;
            }else if(commands.get(i).equals("UP")){
                row--;
            }else if(commands.get(i).equals("DOWN")){
                row++;
            }
        }

        return arr[row][col];
    }
}