class Solution {
    public int minimumSum(int num) {
        int temp = num;
        int arr[] = new int[4];
        for(int i=0; i<4; i++){
            int last = temp % 10;
            arr[i] = last;
            temp /= 10;
        }
        Arrays.sort(arr);
        int n1 = arr[0] * 10 + arr[3];
        int n2 = arr[1] * 10 + arr[2];
        return n1+n2;
    }
}