class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        // int sum = 1;
        // boolean flag = false;
        // for(int i=0; i<n; i++){
        //     if(nums[i] != 0){
        //         sum = sum * nums[i];
        //     }else{
        //         flag= true;
        //     }
            
        // }
        // for(int i=0; i<n; i++){
        //     if(nums[i] != 0 && (flag)){
        //         answer[i] = 0;
        //     }else if(nums[i] != 0){
        //         answer[i] = sum / nums[i];
        //     }else{
        //         answer[i] = sum;
        //     }
            
        // }
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix = suffix * nums[i];
        }

        return answer;
    }
}