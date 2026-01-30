class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(Math.abs(i-j) <= k && nums[j] == key){
                    if(!set.contains(i)){
                        list.add(i);
                        set.add(i);
                    }
                }
            }
        }
        return list;
    }
}