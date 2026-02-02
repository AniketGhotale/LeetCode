class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int total = Math.abs(nums[i] - nums[(i+1)%n]);
            if(sum < total){
                sum = total;
            }
            // if(nums[i] < min){
            //     min = nums[i];
            // }
            // if(nums[i] > max ){
            //     max = nums[i];
            // }
        }
        return sum;
    }
}