class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            res += getcount(nums[i], digit);
        }
        return res;
    }

    int getcount(int n, int d){
        int count = 0;
        while(n > 0){
            if(n%10 == d){
                count++;
            }
            n/=10;
        }
        return count;
    }
}