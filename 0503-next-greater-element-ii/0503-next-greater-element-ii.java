class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int res[] = new int[nums.length];
        int n = nums.length;
        int max = -1;

        for(int i=0; i<n; i++){
            // int ress = next(nums, i, nums[i]);
            
            // if(ress > max && i<n-1){
            //     max = ress;
            // }
            res[i] = next(nums , i, n);
            
        }
        //res[n-1] = max;
        return res;
    }

    int next(int nums[], int i, int n){
        for(int j=1; j<nums.length; j++){
            int idx = (j+i) % n;
            if(nums[idx] > nums[i]){
                return nums[idx];
            }
        }
        return -1;
    }
}