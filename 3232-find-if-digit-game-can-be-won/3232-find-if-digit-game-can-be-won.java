class Solution {
    public boolean canAliceWin(int[] nums) {
        int singled = 0;
        int doubled = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 9){
                doubled += nums[i];
            }else{
                singled += nums[i];
            }
        }
        return singled != doubled;
    }
}