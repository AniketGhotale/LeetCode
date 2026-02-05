class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int org = nums[i];
            int max = 0;
            while(n > 0){
                int last = n % 10;
                max = Math.max(max,last);
                n/=10;
            }
            int num = 0;
            while(org > 0){
                num = (num*10)+max;
                org/=10;
            }
            sum+=num;
        }
        return sum;
    }
}