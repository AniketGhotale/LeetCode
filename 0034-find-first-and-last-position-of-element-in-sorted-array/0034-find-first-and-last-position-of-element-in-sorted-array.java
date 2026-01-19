class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;
        int n=nums.length;
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[first] == target && res[0]==-1){
                res[0] = first;
            }else{
                first++;
            }
            if(nums[last] == target && res[1] == -1){
                res[1] = last;
            }else{
                last--;
            }

        }
        return res;
    }
}