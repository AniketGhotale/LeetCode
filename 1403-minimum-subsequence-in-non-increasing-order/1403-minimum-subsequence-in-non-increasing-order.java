class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum = 0;
        int total = 0;
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            total += x;
        }
        for(int i=n-1; i>=0; i--){
            sum += nums[i];
            list.add(nums[i]);
            if(sum > total - sum){
                break;
            }
        }
        return list;
    }
}