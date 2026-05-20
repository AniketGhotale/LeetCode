class Solution {
    public int xorOperation(int n, int start) {
        int res = start;
        
        for(int i=start+2; i<start+(n*2); i+=2){
            res = res ^ i;
        }
        return res;
    }
}