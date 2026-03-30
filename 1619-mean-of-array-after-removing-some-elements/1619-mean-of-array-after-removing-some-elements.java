class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int k = n / 20;
        //int k = (int)Math.ceil(n * 0.05);
        long sum = 0;
        for(int i=k; i<n-k; i++){
            sum += arr[i];
        }
        double res = (double)sum/( n - (2*k) );
        return res;
    }
}