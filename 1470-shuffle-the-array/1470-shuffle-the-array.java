class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[n*2];
        int top = 0;
        for(int i=0; i<n;i++){
            res[top++] = nums[i];
            res[top++] = nums[n+i];
        }

        return res;
    }
}