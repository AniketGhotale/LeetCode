class Solution {
    public int minCost(int n) {
        int res = (n * (n+1) / 2) - n;
        // int i=1;
        // while(n-i > 0){
        //     res += n- i;
        //     i++;
        // }
        return res;
    }
}