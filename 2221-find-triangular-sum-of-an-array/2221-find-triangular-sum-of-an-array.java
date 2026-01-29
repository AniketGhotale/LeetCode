class Solution {
    public int triangularSum(int[] nums) {
        
        int n = nums.length;
        if(n < 2){
            return nums[0];
        }
        for(int i=nums.length; i>1; i--){
            for(int j=0; j<i-1;j++){
                nums[j] = (nums[j]+nums[j+1])%10;
            }
        }
        // int val = 0;
        // while(n != 1){
        //     int res[] = new int[n-1];
        //     for(int i=0; i<n-1; i++){
        //         res[i] = (nums[i] + nums[i+1]) % 10;
        //     }
        //     nums = res;
        //     n = nums.length;
        // }
        return nums[0];
    }
}