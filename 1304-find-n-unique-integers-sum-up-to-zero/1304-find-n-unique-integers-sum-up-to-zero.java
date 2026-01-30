class Solution {
    public int[] sumZero(int n) {
        int half = n / 2;
        int arr[] = new int[n];
        int idx=0;
        for(int i=-half; i<=half; i++){
            if(i == 0 && n%2==0){
                continue;
            }
            arr[idx] = i;
            idx++;
        }
        return arr;
    }
}