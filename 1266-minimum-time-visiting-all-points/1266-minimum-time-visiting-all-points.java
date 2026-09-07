class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        int a = points[0][0];
        int b = points[0][1];
        for(int i=1; i<points.length; i++){
            int dx = Math.abs(points[i][0] - a);
            int dy = Math.abs(points[i][1] - b);
            res+= (dx > dy) ? dx : dy;
            a = points[i][0];
            b = points[i][1];
        }
        return res;
    }
}