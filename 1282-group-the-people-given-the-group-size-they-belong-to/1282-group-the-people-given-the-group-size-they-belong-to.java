class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0; i<groupSizes.length; i++){
            int num = groupSizes[i];
            if(map.containsKey(num) && map.get(num).size() == num){
                list.add(map.get(num));
                map.put(num,new ArrayList<>());
                map.get(num).add(i);
            }else if(map.containsKey(num)){
                map.get(num).add(i);
            }else{
                map.put(num, new ArrayList<>());
                map.get(num).add(i);
            }
        }
        for(int key : map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }
}