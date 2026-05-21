class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int res[] =nums;
        int n = nums.length;
        for(int i=0; i<k; i++){
            int min = getmin(res);
            res[min] = res[min] * multiplier;
        }
        return res;
    }

    int getmin(int nums[]){
        int l = 999;
        int min = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[min] > nums[i]){
                min = i;
            }
        }
        return min;
    }
}