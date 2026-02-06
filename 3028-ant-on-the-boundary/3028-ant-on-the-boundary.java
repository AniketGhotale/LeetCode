class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int step = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            step+=nums[i];
            if(step == 0){
                count++;
            }
        }
        return count;
    }
}