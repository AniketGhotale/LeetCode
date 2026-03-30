class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans = 101;
        int res = -1;
        for(int i=0; i<capacity.length; i++){
            if(capacity[i] >= itemSize && capacity[i] < ans){
                ans = capacity[i];
                res = i;
            }
        }
        return res;
    }
}