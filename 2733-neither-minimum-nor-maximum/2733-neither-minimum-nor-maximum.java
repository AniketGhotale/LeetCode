class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if(nums.length <= 2){
            return -1;
        }
        for(int i=0; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] != min && nums[i] != max){
                return nums[i];
            }
        }
        return -1;
    }
}