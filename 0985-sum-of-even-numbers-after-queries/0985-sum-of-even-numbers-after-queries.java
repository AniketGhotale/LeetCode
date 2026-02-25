class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int total = 0;
        int n=nums.length;
        int res[] = new int[queries.length];
        for(int i=0; i<n; i++){
            if(nums[i] % 2 == 0){
                total += nums[i];
            }
        }
        for(int i=0; i<queries.length; i++){
            int idx = queries[i][1];
            int val = nums[idx];
            //int val = queries[i][0];
            if(val % 2 == 0){
                total -= val;
            }
            
            nums[idx] = val + queries[i][0];
            if(nums[idx] % 2 == 0){
                total += nums[idx];
            }
            res[i] = total;
            // if(val % 2 == 0 && Math.abs(nums[idx] )% 2 == 1){
            //     total = total - val;
            // }else if(val % 2 == 0 && Math.abs(nums[idx]) % 2 == 0){
            //     total += (nums[idx] - val);
            // }else if(val % 2 == 1 && Math.abs(nums[idx]) % 2 == 0){
            //     total += nums[idx];
            // }
            
            // nums[idx] = nums[idx] + queries[i][0];
            // if(queries[i][1] % 2 == 0 && (nums[i]+queries[i][0]) % 2 == 0){
            //     total += nums[i]+queries[i][0];
            //     nums[i] = total
            // }else{

            // }
        }
        return res;
    }
}