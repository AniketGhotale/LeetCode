class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int res[] = new int[n*2];
        //res = nums.clone();
        int top = 0;
        int rev = n - 1;
        for(int i=0; i<n*2; i++){
            if(top < n){
                res[i] = nums[top];
                top++;
            }else if(top == n){
                res[i] = nums[rev];
                rev--;
            }
        }
        return res;
    }
}