class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = index.length;
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            int idx = index[i];
            int v = nums[i];
            for(int j=n-1; j>idx; j--){
                res[j] = res[j-1];
            }
            res[idx] = v;
        }
        return res;
    }
}