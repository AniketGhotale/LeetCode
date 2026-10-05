class Solution {
    public int arrangeCoins(int n) {
        long low = 1;
        long high = n;
        while(low <= high){
            long mid = (long)low + (high-low)/2;
            if( (long) (mid*(mid+1))/2 < n && (long)(mid+1)*(mid+2)/2 > n ){
                return (int)mid;
            }else if( (long)(mid*(mid+1))/2 > n){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return (int)high;
    }
}