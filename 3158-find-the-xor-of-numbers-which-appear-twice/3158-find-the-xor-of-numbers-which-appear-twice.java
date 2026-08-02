class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(map.contains(nums[i])){
                count ^= nums[i];
            }else{
                map.add(nums[i]);
            }
        }
        return count;
    }
}