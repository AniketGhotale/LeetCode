// class Solution {
//     public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         List<List<Integer>> list = new ArrayList<>();
//         for(int i=0; i<items1.length; i++){
//             map.put(items1[i][0],(map.getOrDefault(items1[i][0],0)+items1[i][1]));
//         }
//         for(int i=0; i<items2.length; i++){
//             map.put(items2[i][0],(map.getOrDefault(items2[i][0],0)+items2[i][1]));
//         }
//         Map<Integer, Integer> sortedMap = new TreeMap<>(map);
//         for(int key : sortedMap.keySet()){
//             List<Integer> l = new ArrayList<>();
//             l.add(key);
//             l.add(map.get(key));
//             list.add(l);
//         }
//         return list;
//     }   
// }


class Solution {
        public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
            int [] sums = new int[1001];
            for (int i = 0; i < items1.length; i++) {
                sums[items1[i][0]] += items1[i][1];
            }

            for (int i = 0; i < items2.length; i++) {
                sums[items2[i][0]] += items2[i][1];
            }
            List<List<Integer>> r = new ArrayList<>();
            for (int i = 0; i < sums.length; i++) {
                if (sums[i] > 0){
                    var c = new ArrayList<Integer>();
                    c.add(i);
                    c.add(sums[i]);
                    r.add(c);
                }
            }
            return r;
        }
    }
