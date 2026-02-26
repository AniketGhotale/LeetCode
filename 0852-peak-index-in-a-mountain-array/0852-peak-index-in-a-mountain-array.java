class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int f = 0;
        int l = arr.length-1;
        int n = arr.length;
        while(f < l){
            int mid = f + (l-f) / 2;
            if(arr[mid] > arr[mid+1]){
                l = mid;
            }else if(arr[mid] < arr[mid+1]){
                f = mid+1;
            }
        }
        return f;
    }
}