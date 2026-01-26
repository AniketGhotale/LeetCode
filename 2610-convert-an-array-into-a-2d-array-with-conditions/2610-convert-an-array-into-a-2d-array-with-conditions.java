class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // List<List<Integer>> list = new ArrayList<>();
        // for(int i=0;i<nums.length; i++){
        //     map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
        // }
        // while(!map.isEmpty()){
        //     List<Integer> l= new ArrayList<>();
        //     for (Integer key : map.keySet()) {
        //         l.add(key);
        //         map.put(key,map.get(key)-1);
        //         if(map.get(key) == 0){
        //             map.remove(key);
        //         }
        //     }
        //     list.add(l);
        // }
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            List<Integer> l= new ArrayList<>();
            for(int j=0; j<nums.length; j++){
                if(!set.contains(nums[j]) && nums[j] != -1){
                    set.add(nums[j]);
                    l.add(nums[j]);
                    nums[j] = -1;
                }
            }
            if(!l.isEmpty()){
                list.add(l);
            }
            set.clear();
        }
        return list;
    }
}