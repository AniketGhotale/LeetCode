class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i=1; i<nums.length; i++){
            int left = nums[i]-diff;
            int right = nums[i]+diff;
            if(set.contains(left) && set.contains(right)){
                count++;
            }
        }
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         for(int k=j+1; k<nums.length; k++){
        //             if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
        //                 count++;
        //             }
        //         }
        //     }
        //}
        return count;
    }
}