class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] < max && nums[i] > min){
                count++;
            }
        }
        return count;
        // if(n <= 2){
        //     return 0;
        // }
        // Arrays.sort(nums);
        // int f = 1;
        
        // int l = 1;
        // for(int i=0; i<n-1; i++){
        //     if(nums[i] == nums[i+1]){
        //         f++;
        //     }else{
        //         break;
        //     }
        // }
        // for(int i=n-1; i>0; i--){
        //     if(nums[i] == nums[i-1]){
        //         l++;
        //     }else{
        //         break;
        //     }
        // }
        // if(f == n){
        //     return 0;
        // }
        // return n - f - l;
    }
}