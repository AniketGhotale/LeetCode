class Solution {
    public int minOperations(int[] nums, int k) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            res ^= nums[i];
        }
        if(res == k){
            return 0;
        }
        return Integer.bitCount(res ^ k);
        //return Integer.bitCount(res) + Integer.bitCount(k);
        //return res ^ Integer.parseInt(Integer.toBinaryString(k));
    }
}