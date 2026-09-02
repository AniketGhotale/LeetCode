class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int res[] = new int[n*2];
        for(int i=0; i<n; i++){
            res[i] = res[ (n*2)-1-i] = nums[i];
        }
        return res;
    }
}