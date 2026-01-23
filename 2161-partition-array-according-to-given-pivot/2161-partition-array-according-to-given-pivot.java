class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[] = new int[nums.length];
        int top = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                res[top] = nums[i];
                top++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] == pivot){
                res[top] = nums[i];
                top++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > pivot){
                res[top] = nums[i];
                top++;
            }
        }

        return res;
    }
}