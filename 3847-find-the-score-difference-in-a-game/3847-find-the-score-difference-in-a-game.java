class Solution {
    public int scoreDifference(int[] nums) {
        int f = 0;
        int s = 0;
        boolean flag = true;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if( (nums[i] % 2 == 1) ^ ( (i+1) % 6 == 0)){
                flag = !flag;
            }
            if(flag){
                f += nums[i];
            }else{
                s += nums[i];
            }
        }
        return f - s;
    }
}