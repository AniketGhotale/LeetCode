class Solution {
    public int countPartitions(int[] nums) {
       int count = 0;
       int sum = 0;
       for(int i=0; i<nums.length; i++){
            sum += nums[i];
       }
       if(sum % 2 != 0){
        return 0;
       }
       int left = 0;
       for(int i=0; i<nums.length-1; i++){
        left += nums[i];
        int right = sum - left;
        if( (left - right) % 2 ==0){
            count++;
        }
       }
    //    for(int i=0; i<nums.length-1; i++){
    //         int leftsum = 0;
    //         int rightsum = 0;
    //         for(int j=0; j<=i; j++){
    //             leftsum += nums[j];
    //         }
    //         for(int k=i+1; k<nums.length; k++){
    //             rightsum += nums[k];
    //         }
    //         int res = leftsum-rightsum;
    //         if(res % 2 == 0){
    //             count++;
    //         }
    //    } 
       return count;
    }
}