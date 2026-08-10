class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        // int n = nums.length;
        // int l = 0;
        // int h = n-1;
        // Arrays.sort(nums);
        // while(l < h){
        //     int sum = nums[l] + nums[h];
        //     if(sum < target){
        //         l++;
        //     }else if(sum > target){
        //         h--;
        //     }else{
        //         res[0] = l;
        //         res[1] = h;
        //         break;
        //     }
        // }
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}