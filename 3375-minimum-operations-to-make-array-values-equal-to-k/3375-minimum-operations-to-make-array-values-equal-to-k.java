class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        //HashSet<Integer> set = new HashSet<>();
        int arr[] = new int[101];
        int count = 0;
        if(nums[0] < k){
            return -1;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > k){
                arr[nums[i]]++;
            }
        }
        for(int i=0; i<101; i++){
            if(arr[i] > 0){
                count++;
            }
        }
        return count;
    }
}