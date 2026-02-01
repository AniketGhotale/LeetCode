class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                arr[left] = nums[i];
                left++;
            }else{
                arr[right] = nums[i];
                right--;
            }
        }
        // while(left < right){
        //     if(nums[left] % 2 == 0 && nums[right] % 2 == 0){
        //         int temp = nums[left];
        //         nums[left] = nums[right];
        //         nums[right] = temp;
        //         left++;
        //         right--;
        //     }else if(nums[left] % 2 == 0){
        //         left++;
        //     }
            
        //     if(nums[right] % 2 == 1){
        //         right--;
        //     }
            
        // }
        return arr;
    }
}