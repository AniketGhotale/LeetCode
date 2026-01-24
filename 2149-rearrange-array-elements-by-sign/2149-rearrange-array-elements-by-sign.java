class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        int idxpos = 0;
        for(int i=0; i<nums.length; i+=2){
            while(nums[idxpos] < 0 && idxpos < nums.length){
                idxpos++;
            }
            res[i] = nums[idxpos];
            idxpos++;
        }
        int idxneg = 0;
        for(int i=1; i<nums.length; i+=2){
            while(nums[idxneg] > 0 && idxneg < nums.length){
                idxneg++;
            }
            res[i] = nums[idxneg];
            idxneg++;
        }
        return res;
    }
}