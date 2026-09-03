class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int res[] = new int[n];
        int count = 0;
        int curr = 0;
        for(int i=0; i<n; i++){
            if(nums[i] < pivot){
                res[curr] = nums[i];
                curr++;
            }else if(nums[i] == pivot){
                count++;
            }
        }
        for(int i=0; i<count; i++){
            res[curr] = pivot;
            curr++;
        }
        for(int i=0; i<n; i++){
            if(pivot < nums[i]){
                res[curr] = nums[i];
                curr++;
            }
        }
        return res;
    }
}