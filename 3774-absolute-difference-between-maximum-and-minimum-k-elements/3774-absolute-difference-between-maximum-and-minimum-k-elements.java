class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int leftsum = 0;
        int rightsum = 0;
        for(int i=0; i<k; i++){
            leftsum += nums[i];
        }
        for(int i=n-1; i>=n-k; i--){
            rightsum += nums[i];
        }
        return Math.abs(rightsum - leftsum);
    }
}