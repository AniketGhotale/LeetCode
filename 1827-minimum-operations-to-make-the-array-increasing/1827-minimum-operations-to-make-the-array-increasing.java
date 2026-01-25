class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        // if(n == nums.length){
        //     return 0;
        // }
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]){
                count += (nums[i-1] - nums[i]) +1;
                nums[i] += (nums[i-1] - nums[i]) +1;
            }
        }
        // if(nums[n-2] >= nums[n-1]){
        //     count += (nums[n-2] - nums[n-1]) +1;
        // }
        return count;
    }
}