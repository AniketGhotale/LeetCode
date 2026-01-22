class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length+1;
        int sum = 0;
        for(int i=0 ; i<nums.length; i++){
            sum += nums[i];
        }
        int total = n * (n-1) /2;
        return total - sum;
    
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i] , i);
        // }
        // for(int i=0 ; i<=nums.length; i++){
        //     if(!map.containsKey(i)){
        //         return i;
        //     }
        // }
        // return -1;
    }
}