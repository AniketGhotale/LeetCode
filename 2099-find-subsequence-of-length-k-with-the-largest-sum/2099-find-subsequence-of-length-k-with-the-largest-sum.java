class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if(nums.length == k){
            return nums;
        }
        int pair[][] = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }

        Arrays.sort(pair, (a,b) -> Integer.compare(a[0],b[0]));
        int c = nums.length - k;
        int r = 0;
        int p[][] = new int[k][2];
        for(int i=c; i<nums.length; i++){
            p[r][0] = pair[i][0];
            p[r][1] = pair[i][1];
            r++;
        }

        Arrays.sort(p, (a,b) -> Integer.compare(a[1],b[1]));

        int res[] = new int[k];
        for(int i=0; i<p.length; i++){
            res[i] = p[i][0];
        } 
        return res;
    }
}