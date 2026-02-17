class Solution {
    public long[] findPrefixScore(int[] nums) {
        long cov[] = new long[nums.length];
        long target[] = new long[nums.length];
        int max = -1;
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            cov[i] = nums[i] + max;
            if(i ==0){
                target[i] = cov[i];
            }else{
                target[i] = cov[i] + target[i-1];
            }
        }
        return target;
    }
}