class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        if(nums[0] < k){
            return -1;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > k){
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}