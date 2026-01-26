class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int res = 0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
            if(map.get(nums[i]) > max){
                max = map.get(nums[i]);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key) == max){
                res += max;
            }
        }
        return res;
    }
}