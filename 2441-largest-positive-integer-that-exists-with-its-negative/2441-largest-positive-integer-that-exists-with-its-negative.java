class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        int num = -1;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            //max = Math.max(max,nums[i]);
            if(map.containsKey(-nums[i]) && nums[i] > max){
                max = nums[i];
                num = max;
            }
        }
        return num;
    }
}