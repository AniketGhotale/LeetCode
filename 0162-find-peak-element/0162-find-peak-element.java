class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        if(nums.length == 1){
            return 0;
        }
        int mid = 0;
        while(low < high){
            mid = low + (high-low) /2;
            // if(mid == 0){
            //     if(nums[mid] > nums[mid+1]){
            //         return mid;
            //     }   
            // }
            // if(mid == nums.length-1){
            //     if(nums[mid] > nums[mid-1]){
            //         return mid;
            //     }   
            // }
            if(nums[mid] > nums[mid+1]){
                
                high = mid;
            }else if(nums[mid] < nums[mid+1]){
                low = mid+1;
            }
        } 
        return low;
    }
}