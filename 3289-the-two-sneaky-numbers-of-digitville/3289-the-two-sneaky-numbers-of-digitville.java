class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int res[] = new int[2];
        int arr[] = new int[nums.length-2];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        int c = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                res[c] = i;
                c++;
            }
        }
        return res;
    }
}