class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        int arr[] = new int[10];
        for(int i=0; i<n; i++){
            int no = num.charAt(i) - '0';
            arr[no]++;
        }
        for(int i=0; i<n; i++){
            int no = num.charAt(i) - '0';
            if(arr[i] != no){
                return false;
            }
        }
        return true;
    }
}