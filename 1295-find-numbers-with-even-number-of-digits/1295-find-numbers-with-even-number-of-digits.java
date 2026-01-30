class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        String arr[] = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(arr[i].length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}