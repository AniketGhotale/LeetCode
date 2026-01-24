class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            while(nums[i] > 0){
                int last = nums[i] % 10;
                sum += last;
                nums[i] /= 10;
            }
            if(sum < min){
                min = sum;
            }
        }
        return min;
    }
}