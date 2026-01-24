class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int dsum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(nums[i] > 0){
                int last = nums[i] % 10;
                dsum += last;
                nums[i] /= 10;
            }
        }
        return Math.abs(sum - dsum);
    }
}