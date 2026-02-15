class Solution {
    public int reductionOperations(int[] nums) {
        int count = 0;
        int op = 0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                op++;
            }
            count += op;
        }
        return count;
    }
}