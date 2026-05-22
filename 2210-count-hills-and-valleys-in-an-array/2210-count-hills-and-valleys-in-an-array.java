class Solution {
    public int countHillValley(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            if(i < nums.length-1 && (nums[i] == nums[i+1])){
                continue;
            }
            if(ishill(i, nums[i], nums)){
                res++;
            }
        }
        return res;
    }
    boolean ishill(int idx,int num, int nums[]){
        boolean ll = false;
        boolean ls = false;
        boolean rl = false;
        boolean rs = false;
        int t1 = idx;
        int t2 = idx;
        while(t1 >= 0){
            if(nums[t1] > num){
                ll = true;
                break;
            }else if(nums[t1] < num){
                ls = true;
                break;
            }
            t1--;
        }

        while(t2 < nums.length){
            if(nums[t2] > num){
                rl = true;
                break;
            }else if(nums[t2] < num){
                rs = true;
                break;
            }
            t2++;
        }

        if( ( ll && rl) || (ls && rs)){
            return true;
        }
        return false;
    }
}