class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            map.add(nums[i]);
        }
        int num = -1;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            //max = Math.max(max,nums[i]);
            if(map.contains(-nums[i]) && nums[i] > max){
                max = nums[i];
                num = max;
            }
        }
        return num;
    }
}