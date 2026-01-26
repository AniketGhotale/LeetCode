class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
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