class Solution {
    public int minCost(int n) {
        int res = 0;
        int i=1;
        while(n-i > 0){
            res += n- i;
            i++;
        }
        return res;
    }
}