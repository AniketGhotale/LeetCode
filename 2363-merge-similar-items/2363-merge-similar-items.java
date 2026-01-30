class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        //HashMap<Integer,Integer> map = new HashMap<>();
        int sum[] = new int[1001];
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<items1.length; i++){
            sum[items1[i][0]] += items1[i][1];
            //map.put(items1[i][0],(map.getOrDefault(items1[i][0],0)+items1[i][1]));
        }
        for(int i=0; i<items2.length; i++){
            sum[items2[i][0]] += items2[i][1];
            //map.put(items2[i][0],(map.getOrDefault(items2[i][0],0)+items2[i][1]));
        }
        //Map<Integer, Integer> sortedMap = new TreeMap<>(map);
        // for(int key : sortedMap.keySet()){
        //     List<Integer> l = new ArrayList<>();
        //     l.add(key);
        //     l.add(map.get(key));
        //     list.add(l);
        // }
        for(int i=0; i<sum.length; i++){
            if(sum[i] > 0){
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(sum[i]);
                list.add(l);
            }
        }
        return list;
    }   
}
