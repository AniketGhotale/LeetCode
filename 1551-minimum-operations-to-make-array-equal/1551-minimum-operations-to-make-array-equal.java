class Solution {
    public int minOperations(int n) {
        int arr[]= new int[n];
        int target = 0;
        int sum=0;
        int count =0;
        for(int i=0; i<n; i++){
            arr[i]=(2*i)+1;
            sum+=arr[i];
        }
        target = sum/n;
        for(int i=0; i<(n/2); i++){
            count+=target-arr[i];
        }
        return count;
    }
}