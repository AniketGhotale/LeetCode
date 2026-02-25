import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];

        // Store distance + index
        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < points.length; i++){
            int x = points[i][0];
            int y = points[i][1];
            int dist = x*x + y*y;   // no sqrt needed
            list.add(new int[]{dist, i});
        }

        // Sort by distance
        Collections.sort(list, (a, b) -> a[0] - b[0]);

        // Take first k
        for(int i = 0; i < k; i++){
            int idx = list.get(i)[1];
            res[i][0] = points[idx][0];
            res[i][1] = points[idx][1];
        }

        return res;
    }
}






// class Solution {
//     public int[][] kClosest(int[][] points, int k) {
//         int res[][] = new int[k][2];
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0; i<points.length; i++){
//             int x = points[i][0];
//             int y = points[i][1];
//             map.put(distance(x,y),i);
//         }
//         map.entrySet()
//    .stream()
//    .sorted(Map.Entry.comparingByKey());
//         int a = 0;
//         for(int key : map.keySet()){
//             if(a < k){
//                 int idx = map.get(key);
//                 res[a][0] = points[idx][0];
//                 res[a][1] = points[idx][1];
//                 a++;
//             }
            
//         }
//         return res;
//     }
//     int distance(int x,int y){
//         return (int) Math.sqrt((x*x) + (y*y));
//     }
// }