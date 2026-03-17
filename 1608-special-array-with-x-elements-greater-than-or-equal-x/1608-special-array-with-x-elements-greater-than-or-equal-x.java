class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<=n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[j] >= i){
                    count++;
                }
            }
            if(count == i){
                return i;
            }
            // if(nums[i] == 0){
            //     continue;
            // }else{
            //     int x = n-i;
            //     if(nums[i] >= x){
            //         return x;
            //     }
            // }
        }
        return -1;
    }
}