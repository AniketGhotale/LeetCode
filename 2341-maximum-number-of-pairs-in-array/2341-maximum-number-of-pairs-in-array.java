class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pair = 0;
        int remain = 0;
        int arr[] = new int[101];
        for(int i=0 ;i<nums.length; i++){
            arr[nums[i]]++;
        }
        for(int i=0; i<arr.length; i++){
            while(arr[i] >= 2){
                pair++;
                arr[i]-=2;
            }
            remain+=arr[i];
        }
        int res[] = new int[2];
        res[0] = pair;
        res[1] = remain;
        return res;
    }
}