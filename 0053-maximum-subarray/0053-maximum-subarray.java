class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum+nums[i]);
            max = Math.max(max,sum);
        }
        return max;
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         sum += nums[j];
        //         max = Math.max(max,sum);
        //     }
        // }
        // return max;
    }
}