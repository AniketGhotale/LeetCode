class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        
        int n = points.length;
        int max = 0;
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        // for(int i=0; i<n-1; i++){
        //     for(int j=0; j<n-i-1; j++){
        //         if(points[j][0] > points[j+1][0]){
        //             int temp[] = points[j];
        //             points[j] = points[j+1];
        //             points[j+1] = temp;
        //         }
        //     }
        // }

        for(int i=1; i<n; i++){
            max = Math.max(max, points[i][0] - points[i-1][0]);
        }
        return max;
    }
}