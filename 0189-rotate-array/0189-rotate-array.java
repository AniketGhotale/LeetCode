class Solution {
    public void rotate(int[] nums, int k) {
        int res[] = new int[nums.length];
        k = k % nums.length;
        int r = k;
        int i=0;
        
        for(i=0; i<nums.length-r; i++){
            res[i+k] = nums[i];
        }

        for(int j=0; j<r; j++){
            res[j] = nums[i];
            i++;
        }
        for(int x=0; x<nums.length; x++){
            nums[x] = res[x];
        }
    }
}