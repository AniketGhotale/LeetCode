class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(search(original,nums)){
            original = 2 * original;
        }
        return original;
    }
    boolean search(int target,int nums[]){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        // int first = 0;
        // int last = nums.length-1;
        // while(first < last){
        //     int mid = low + (high-low) / 2;
        //     if(nums[mid] < target){

        //     }
        // }
        return false;
    }
}