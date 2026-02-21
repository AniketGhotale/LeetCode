class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        // int odd[] = new int[n/2];
        // int even[] = new int[n/2];
        int res[] = new int[n];
        int odd = 1;
        int even = 0;
        for(int i=0; i<n; i++){
            if(nums[i] % 2 == 0){
                res[even] = nums[i];
                even+=2;
            }else{
                res[odd] = nums[i];
                odd+=2;
            }
        }
        return res;
    }
}