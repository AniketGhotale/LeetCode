class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int res[] = new int[n*2];
        //res = nums.clone();
        int top = 0;
        int rev = (n*2) - 1;
        // for(int i=0; i<n; i++){
        //     res[i] = res[2*n -1 -i] = nums[i];
        // }
        int i = 0;
        while(top < rev){
            res[top] = nums[i];
            res[rev] = nums[i];
            i++;
            top++;
            rev--;
        }
        // for(int i=0; i<n*2; i++){
        //     if(top < n){
        //         res[i] = nums[top];
        //         top++;
        //     }else if(top == n){
        //         res[i] = nums[rev];
        //         rev--;
        //     }
        // }
        return res;
    }
}