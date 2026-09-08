class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        while(n > 0){
            int q = n % 2;
            if(q == 1){
                res++;
            }
            n/=2;
        }
        return res;
    }
}