class Solution {
    public int minimumSum(int[] nums) {
        int res = 9999;
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i] < nums[j] && nums[k] < nums[j] && nums[i]+nums[j]+nums[k] < res){
                        res = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return res==9999?-1:res;
    }
}