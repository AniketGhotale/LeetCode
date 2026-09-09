class Solution {
    public long countCommas(long n) {
        long a = 999999999999L;

        if(n > 999 && n < 999999){
            return n - 999;
        }else if(n > 999 && n < 999999999){
            long res = n - 999;
            res += n - 999999;
            return res;
        }else if( n > 999 && n < a){
            long res = n - 999;
            res += n - 999999;
            res += n - 999999999;
            return res;
        }else if(n > 999 && n < 999999999999999L){
            long res = n - 999;
            res += n - 999999;
            res += n - 999999999L;
            res += n - 999999999999L;
            return res;
        }else if(n > 999){
            long res = n - 999;
            res += n - 999999;
            res += n - 999999999;
            res += n - 999999999999L;
            res += n - 999999999999999L;
            return res;
        }
        return 0;
    }
}