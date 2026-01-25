class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                count += (nums[i] - nums[i+1]) +1;
                nums[i+1] += (nums[i] - nums[i+1]) +1;
            }
        }
        if(nums[n-2] >= nums[n-1]){
            count += (nums[n-2] - nums[n-1]) +1;
        }
        return count;
    }
}