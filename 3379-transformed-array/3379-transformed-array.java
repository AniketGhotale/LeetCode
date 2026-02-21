class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            int num = nums[i];
            int idx = 0;
            if(num < 0){
                idx = ((i + num % n + n) % n);               
            }else{
                idx = (i + num) % n;
            }
            res[i] = nums[idx];
        }
        return res;
    }
}