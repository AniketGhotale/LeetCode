class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int res[] = new int[n];
        left[0]=0;
        int last = n-1;
        right[last] = 0;
        last--;
        for(int i=1; i<n; i++){
            left[i] = left[i-1] + nums[i-1];
            right[last] = right[last+1] + nums[last+1];
            last--;
        }

        for(int i=0; i<n; i++){
            res[i] = Math.abs(left[i] - right[i]);
        }
        return res;
    }
}