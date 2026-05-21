class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int res[] = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            res[i] = getcount(points, queries[i][0], queries[i][1], queries[i][2]);
        }
        return res;
    }

    int getcount(int[][] points, int x, int y, int r){
        int xl = x-r;
        int xr = x+r;
        int yt = y+r;
        int yb = y-r;
        int count = 0;
        
        for(int i=0; i<points.length; i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            int dx = x1 - x;
            int dy = y1 - y;
            if( (dx*dx) + (dy*dy) <= (r*r)){
                count++;
            }
            // if( (x1 > dx && x1 < dx) && (y1 < dy && y1 > dy)){
            //     count++;
            // }
        }
        return count;
    }
    
}