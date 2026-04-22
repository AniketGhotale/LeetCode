class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 0;
        int n = 1;
        int idx = 0;

        for(int i=1; i<=10000; i++){
            if(idx < arr.length && arr[idx] == i){
                idx++; 
            }else if(n == k){
                return i;
            }else{
                n++;
            }
        }
        return n;
    }
}