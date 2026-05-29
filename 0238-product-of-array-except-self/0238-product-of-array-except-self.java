class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int sum = 1;
       int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                sum = sum * nums[i];
            }else{
                count++;
            }
            
        }
        for(int i=0; i<n; i++){
            if(count>1){
                answer[i] = 0;
            }else if(count == 1){
                if(nums[i] != 0){
                    answer[i] = 0;
                }else{
                    answer[i] = sum;
                }
            }else{
                answer[i] = sum / nums[i];
            }
            
            
        }
        // answer[0] = 1;
        // for (int i = 1; i < n; i++) {
        //     answer[i] = answer[i - 1] * nums[i - 1];
        // }

        // int suffix = 1;
        // for (int i = n - 1; i >= 0; i--) {
        //     answer[i] = answer[i] * suffix;
        //     suffix = suffix * nums[i];
        // }

        return answer;
    }
}