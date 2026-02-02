class Solution {
    public int findLucky(int[] arr) {
        //HashMap<Integer,Integer> map = new HashMap<>();
        int res[] = new int[501];
        int large = -1;
        for(int i=0; i<arr.length;i++){
            res[arr[i]]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == res[arr[i]] && large < arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
}