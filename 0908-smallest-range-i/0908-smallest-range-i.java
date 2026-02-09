class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            // if(nums[i] < k){
            //     nums[i]+=k;
            // }else if(nums[i] > k){
            //     nums[i]-=k;
            // }else{
            //     nums[i] = nums[i-1];
            // }
        }
        int diff = (max-k) - (min+k);
        return Math.max(0,diff);
    }
}