class Solution {
    public int minimumOperations(int[] nums) {
        //Set<Integer> set=new HashSet<>();
        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            // if(nums[i] == 0){
            //     continue;
            // }
            // set.add(nums[i]);
            if(nums[i]!=0){
                int curr = nums[i];
                count++;
                for(int j=i; j<nums.length;j++){
                    nums[j] -= curr; 
                }
            }
        } 
        return count;  
        //return set.size();
    }
}