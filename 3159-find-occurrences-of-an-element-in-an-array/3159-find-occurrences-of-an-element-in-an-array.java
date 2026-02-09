class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        //HashMap<Integer,List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = queries.length;
        int res[] = new int[n];
        for(int i=0; i<nums.length; i++){
            if(nums[i] == x){
                list.add(i);
            }
            //map.putIfAbsent(nums[i],new ArrayList<>());
            //int last = map.get(nums[i]).get(map.get(nums[i]).size());
            //map.get(nums[i]).add(i);
        }
        for(int i=0; i<n; i++){
            int curr = queries[i];
            // if(map.containsKey(x) && curr <= map.get(x).size()){
            //     res[i] = map.get(x).get(curr-1);
            //     //res[i] = pos;
            //     // map.get(x).remove(curr-1);
            //     // if(map.get(x).isEmpty()){
            //     //     map.remove(x);
            //     // }
            // }else{
            //     res[i] = -1;
            // }
            if(curr > list.size()){
                res[i] = -1;
            }else{
                res[i] = list.get(curr-1);
            }
        }
        return res;
    }
}