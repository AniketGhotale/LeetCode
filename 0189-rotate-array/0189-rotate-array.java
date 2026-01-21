class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        // for(i=0; i<nums.length; i++){
        //     res[(i+k)%nums.length] = nums[i];
        // }

        // for(int x=0; x<nums.length; x++){
        //     nums[x] = res[x];
        // }
    }

    void reverse(int nums[], int left,int right){
        while(left  < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}