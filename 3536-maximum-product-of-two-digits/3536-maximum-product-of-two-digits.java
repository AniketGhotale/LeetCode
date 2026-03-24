class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int sec = 0;
        while(n > 0){
            int last = n % 10;
            if(last >= max){
                sec = max;
                max = last; 
            }else if(last >= sec){
                sec = last;
            }
            n /= 10;
        }
        return max * sec;
    }
}