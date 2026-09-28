class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        int max[] = new int[n];
        int min[] = new int[n];
        int res = -1;
        max[0] = nums[0];
        min[n-1] = nums[n-1];
        int last = n-2;
        for(int i=1; i<n; i++){
            if(nums[i] > max[i-1]){
                max[i] = nums[i];
            }else{
                max[i] = max[i-1];
            }
            if(nums[last] < min[last+1]){
                min[last] = nums[last];
            }else{
                min[last] = min[last+1];
            }
            last--;
        }
        for(int i=0; i<n; i++){
            if(max[i] - min[i] <= k){
                return i;
            }
        }
        return -1;
    }
}