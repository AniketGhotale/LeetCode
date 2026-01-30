class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        //String arr[] = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            int length = 0;
            int num = nums[i];
            while(num > 0){
                length++;
                num/=10;
            }
            if(length % 2 == 0){
                count++;
            }
            //arr[i] = String.valueOf(nums[i]);
        }
        // for(int i=0; i<nums.length; i++){
        //     if(arr[i].length() % 2 == 0){
        //         count++;
        //     }
        // }
        return count;
    }
}