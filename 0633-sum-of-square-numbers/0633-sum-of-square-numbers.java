class Solution {
    public boolean judgeSquareSum(int c) {
        // if(c < 3){
        //     return true;
        // }
        long num = (long)Math.ceil(Math.sqrt(c));
        long low = 0;
        long high = num;
        while(low <= high){
            long sum = (low*low) + (high*high);
            if(sum < c){
                low++;
            }else if(sum > c){
                high--;
            }else{
                return true;
            }
        }
        return false;
    }
}