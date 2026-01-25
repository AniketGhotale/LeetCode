class Solution {
    public int maxProductDifference(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // return (nums[n-1] * nums[n-2]) - (nums[0] * nums[1]);
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest){
                secondlargest = largest;
                largest = nums[i];
            }else if(nums[i] > secondlargest){
                secondlargest = nums[i];
            }

            if(nums[i] < small){
                secondsmall = small;
                small = nums[i];
            }else if(nums[i] < secondsmall){
                secondsmall = nums[i];
            }
        }
        return (largest * secondlargest) - (small * secondsmall);
    }
}